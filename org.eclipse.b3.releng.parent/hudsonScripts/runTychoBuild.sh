#!/usr/bin/env bash

build_home=${WORKSPACE:-/home/davidw/gitCBI}
export tmp_dir=${build_home}/aggr/tmp
export local_mvn_repo=${build_home}/aggr/localMvnRepo

repo_dir=${build_home}/org.eclipse.cbi.p2repo.aggregator

out_file=${build_home}/aggr/buildOutput.txt

# This first write does not "append", the rest need to.
env | tee ${out_file}

cleanLocal=$1

signjars=$2

if [[ -z "${cleanLocal}" ]]
then
  cleanLocal="NotSpecified"
fi

if [[ "${cleanLocal}" == "true" ]]
then
  rm -fr ${tmp_dir}
  rm -fr ${local_mvn_repo}
  printf "\n\t[INFO] %s\n\n" "cleanLocal argument was true so tmp and local maven repo were removed" | tee -a ${out_file}
else
  printf "\n\t[WARNING] %s\n\n" "cleanLocal argument was not true so tmp and local maven repo were not removed" | tee -a ${out_file}
fi
mkdir -p ${tmp_dir}
mkdir -p ${local_mvn_repo}

if [[ -z "${signJars}" ]]
then
  signJars="NotSpecified"
fi

if [[ "${signJars}" == "true" ]] 
then
   sign_jars_arg="-Peclipse-sign"
fi

# Without the ANT_OPTS, we do get messages about "to get repeatable builds, to ignore sysclasspath"
export ANT_HOME=${ANT_HOME:-/shared/common/apache-ant-1.9.6}
export ANT_OPTS=${ANT_OPTS:-"-Dbuild.sysclasspath=ignore -Dincludeantruntime=false"}
export MAVEN_OPTS="-Xms1048m -Xmx2096m -Djava.io.tmpdir=${tmp_dir} ${MIRROR_SETTING}"
TYCHO_ARGS="-Djava.io.tmpdir=${tmp_dir} -Dtycho.localArtifacts=ignore -Dtycho.debug.artifactcomparator ${MIRROR_SETTING} ${DIRTY_SETTING}"
export JAVA_HOME=/shared/common/jdk1.8.0_x64-latest
export JAVA_CMD=${JAVA_HOME}/jre/bin/java
export MAVEN_PATH=${MAVEN_PATH:-/shared/common/apache-maven-latest/bin}
export PATH=$JAVA_HOME/bin:$MAVEN_PATH:$ANT_HOME/bin:$PATH

cd ${repo_dir}

printf "\n\t[INFO] %s\n" "mvn clean verify ...:" | tee -a ${out_file}
printf "\n\t[INFO] %s\n" "MAVEN_OPTS: ${MAVEN_OPTS}" | tee -a ${out_file}
printf "\n\t[INFO] %s\n\n" "TYCHO_ARGS: ${TYCHO_ARGS}" | tee -a ${out_file}
# All -D type settings need to come before the -P settings, apparently.
mvn clean verify -X -e --update-snapshots -DskipTests=true -Dmaven.repo.local=$local_mvn_repo ${TYCHO_ARGS} -Pbree-libs ${sign_jars_arg} 2>&1 | tee -a ${out_file}
RC=$?

printf "\n\t[INFO] %s\n\n" "Build Output in ${out_file}"

exit $RC
