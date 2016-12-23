#!/usr/bin/env bash

function writeArtifactsHeader
{
  outfile=$1
  printf "%s\n" "<?xml version='1.0' encoding='UTF-8'?>" > ${outfile}
  printf "%s\n" "<?compositeArtifactRepository version='1.0.0'?>" >> ${outfile}
  printf "%s\n" "<repository name='Eclipse CBI p2 Repository Aggregator'  type='org.eclipse.equinox.internal.p2.artifact.repository.CompositeArtifactRepository' version='1.0.0'>" >> ${outfile}
  printf "%s\n" "  <properties size='3'>" >> ${outfile}
  printf "%s\n" "    <property name='p2.timestamp' value='1313779613118'/>" >> ${outfile}
  printf "%s\n" "    <property name='p2.compressed' value='true'/>" >> ${outfile}
  printf "%s\n" "    <property name='p2.atomic.composite.loading' value='true'/>" >> ${outfile}
  printf "%s\n" "  </properties>" >> ${outfile}
  printf "%s\n" "  <children size='3'>" >> ${outfile}

}

function writeContentHeader
{
  outfile=$1
  printf "%s\n" "<?xml version='1.0' encoding='UTF-8'?>" > ${outfile}
  printf "%s\n" "<?compositeMetadataRepository version='1.0.0'?>" >> ${outfile}
  printf "%s\n" "<repository name='Eclipse CBI p2 Repository Aggregator'  type='org.eclipse.equinox.internal.p2.metadata.repository.CompositeMetadataRepository' version='1.0.0'>" >> ${outfile}
  printf "%s\n" "  <properties size='3'>" >> ${outfile}
  printf "%s\n" "    <property name='p2.timestamp' value='1313779613118'/>" >> ${outfile}
  printf "%s\n" "    <property name='p2.compressed' value='true'/>" >> ${outfile}
  printf "%s\n" "    <property name='p2.atomic.composite.loading' value='true'/>" >> ${outfile}
  printf "%s\n" "  </properties>" >> ${outfile}
  printf "%s\n" "  <children size='3'>" >> ${outfile}

}

function writeFooter
{
  outfile=$1
  printf "%s\n" "  </children>" >> ${outfile}
  printf "%s\n" "</repository>" >> ${outfile}
}

function writeCompositeP2Index
{
  printf "%s\n" "version=1" > "${p2Index}"
  printf "%s\n" "metadata.repository.factory.order=compositeContent.xml" >> "${p2Index}"
  printf "%s\n" "artifact.repository.factory.order=compositeArtifacts.xml" >> "${p2Index}"
}

function writeChildren
{
  outfile=$1
  repoRoot=$2
  # NOTE: we always take "most recent 3 builds".
  # we use "I20" as prefix that all our child repo directories start with
  # such as "I2016...". So, in 80 years will need some maintenance. :)
  # But, otherwise, this cheap heuristic finds existing files such as "composite*".
  pushd "${repoRoot}" >/dev/null
  children=$(ls -1td I20* | head -3)
  popd >/dev/null

  for child in $children
  do
    printf "%s%s%s\n" "    <child location='" $child "' />"  >> ${outfile}
  done

}

function getLatestBuildId
{
  repoRoot=$1
  # NOTE: we always take "most recent 3 builds".
  # we use "I20" as prefix that all our child repo directories start with
  # such as "I2016...". So, in 80 years will need some maintenance. :)
  # But, otherwise, this cheap heuristic finds existing files such as "composite*".
  pushd "${repoRoot}" >/dev/null
  latest=$(ls -1td I20* | head -1)
  popd >/dev/null

  echo "${latest[0]}"

}

repoRoots=("/home/data/httpd/download.eclipse.org/cbi/updates/aggregator/ide/4.6" "/home/data/httpd/download.eclipse.org/cbi/updates/aggregator/headless/4.6")
# Normally "writeRepoRoots" is the same as "repoRoots", but might not always be, plus
# it is very handy for testing this script not to have to write to the "production" area.
#writeRepoRoots=("${PWD}/ide" "${PWD}/headless")
writeRepoRoots=(${repoRoots[@]})
indices=(0 1)
for index in ${indices[@]}
do
  #echo -e "[DEBUG] index: ${index}\n"
  writeRepoRoot="${writeRepoRoots[$index]}"
  #echo -e "[DEBUG] writeRepoRoot: ${writeRepoRoot}\n"
  mkdir -p "${writeRepoRoot}"
  RC=$?
  if [[ $RC != 0 ]]
  then
    echo -e "[ERROR] Could not create directory at ${writeRepoRoot}\n"
    exit $RC
  fi
  repoRoot="${repoRoots[$index]}"
  #echo -e "[DEBUG] repoRoot: ${repoRoot}\n"

  artifactsCompositeFile="${writeRepoRoot}/compositeArtifacts.xml"
  contentCompositeFile="${writeRepoRoot}/compositeContent.xml"
  p2Index="${writeRepoRoot}/p2.index"

  writeArtifactsHeader "${artifactsCompositeFile}"
  writeChildren "${artifactsCompositeFile}" "${repoRoot}"
  writeFooter "${artifactsCompositeFile}"

  writeContentHeader "${contentCompositeFile}"
  writeChildren "${contentCompositeFile}" "${repoRoot}"
  writeFooter "${contentCompositeFile}"

  writeCompositeP2Index "${p2Index}"
done

# Now write latest ${buildId}/buildResults.html to our web site/index.html
# Note: we assume Hudson has already checked out latest version
# of www repo:  file:///gitroot/www.eclipse.org/cbi.git
# AND we ask Hudson to "clean workspace" first! (for now) 

# and our "latest aggregator downloads" index.html will go into
# ${WORKSPACE}/cbi/downloads/aggregatorLatest/
# but then we still need to commit and push (under the cbi.genie Id)
# reporoots[1] should be the "headless" repository.

printf "\n\t[INFO] %s\n" "Confirm \$USER and 'whoami' with git config"
printf "\n\t[INFO] %s\n" "\$USER is $USER"
printf "\n\t[INFO] %s\n" "whoami is $(whoami)"

# if it exists, remove it before new cloning
if [[ -e "${WORKSPACE}/cbi" ]]
  then
    rm -fr ${WORKSPACE}/cbi
  fi

git clone --origin origin --branch master /gitroot/www.eclipse.org/cbi.git cbi


pushd ${WORKSPACE}/cbi
git config --global push.default simple
# print config and status, just to have in log, for now
printf "\n\t[INFO] %s\n" " = = Start of git config --list = ="
git config --list
printf "\n\t[INFO] %s\n" " = = End of git config --list = ="
printf "\n\t[INFO] %s\n" " = = Confirm we are on master = ="
git checkout master
printf "\n\t[INFO] %s\n" " = = And that we have the latest = ="
git pull
RC=$?
if [[ $RC != 0 ]]
then
  printf "\n\t[WARNING] %s\n" "git pull returned non-zero return code: $RC. Will try reset."
  git reset --hard
  RC=$?
  if [[ $RC != 0 ]]
  then
    printf "\n\t[WARNING] %s\n" "git reset --hard returned non-zero return code: $RC. Will try to continue ..."
  fi
fi
printf "\n\t[INFO] %s\n" " = = Confirm status is clear = ="
git status

printf "\n\t[DEBUG] %s\n" "repo root from which to get latest buildId: ${repoRoots[1]}"
latestBuildId=$(getLatestBuildId ${repoRoots[1]})
printf "\n\t[DEBUG] %s\n" "found latest buildId: ${latestBuildId}"
cp ${repoRoots[1]}/${latestBuildId}/buildResults.html ${WORKSPACE}/cbi/downloads/aggregatorLatest/index.html
RC=$?
if [[ $RC != 0 ]]
then
  printf "\n\t[ERROR] %s\n" "Copy to index.html returned non-zero return code: $RC. Exiting early."
  exit $RC
else
  printf "\n\t[INFO] %s\n" "Copied ${latestBuildId}/buildResults.html to aggregatorLatest/index.html"
fi

printf "\n\t[INFO] %s\n" " = = Confirm status shows one change = ="
git status

git add --all

printf "\n\t[INFO] %s\n" " = = Confirm status shows one can be committed = ="
git status

# Commit 
git commit --verbose -m "Auto commit from Hudson 'cbi.p2repo.aggregator_addComposites' job"
RC=$?
if [[ $RC != 0 ]]
then
  printf "\n\t[ERROR] %s\n" "git commit returned non-zero return code: $RC. Exiting early."
  exit $RC
fi

printf "\n\t[INFO] %s\n" " = = Confirm status shows ahead by one commit = ="
git status


# 'origin1' is the name Hudson has assigned. 
# but, since I started to do clone above, I will assume 'origin'
git push --verbose origin master:refs/heads/master
RC=$?
if [[ $RC != 0 ]]
then
  printf "\n\t[ERROR] %s\n" "git push returned non-zero return code: $RC. Exiting early."
  exit $RC
fi

popd

exit 0
