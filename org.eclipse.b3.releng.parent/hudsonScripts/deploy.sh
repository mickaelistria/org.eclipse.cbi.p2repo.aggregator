#!/usr/bin/env bash

# This job is ran after "runTychoBuild.sh" is ran in the "cleanAndDeploy" Hudson job.

# The default for build home is simply where I do my local build. Feel free to change in your local copy. 
build_home=${WORKSPACE:-/home/davidw/gitCBI}
propertiesfile="${build_home}/org.eclipse.cbi.p2repo.aggregator/org.eclipse.b3.product/target/mavenproperties.properties"
sourceProperties="${build_home}/mavenproperties.shsource"
phpProperties="${build_home}/mavenproperties.php"

function deployRepos
{
  newRepo=$1
  builtRepo=$2
  mkdir -p ${newRepo}
  cp -r ${builtRepo}/* ${newRepo}/

  #TODO: add mirror URL, etc.
}

source $sourceProperties

baseDL=/home/data/httpd/download.eclipse.org/cbi/updates/aggregator
ideUpdate=${baseDL}/ide/${updateRelease}/${buildId}
headlessUpdate=${baseDL}/headless/${updateRelease}/${buildId}

deployRepos ${ideUpdate} ${build_home}/org.eclipse.cbi.p2repo.aggregator/org.eclipse.b3.site.eclipse/target/repository
deployRepos ${headlessUpdate} ${build_home}/org.eclipse.cbi.p2repo.aggregator/org.eclipse.b3.product/target/repository

# save away "data" from the build, as well as the deployable headless products
cp ${build_home}/aggr/buildOutput.txt ${headlessUpdate}
cp ${sourceProperties} ${headlessUpdate}
cp ${propertiesfile} ${headlessUpdate}

productroot=${build_home}/org.eclipse.cbi.p2repo.aggregator/org.eclipse.b3.product/target/products
cp ${productroot}/org.eclipse.b3.product-linux.gtk.x86_64.tar.gz ${headlessUpdate}/headless_${buildId}_linux.gtk.x86_64.tar.gz
cp ${productroot}/org.eclipse.b3.product-macosx.cocoa.x86_64.tar.gz ${headlessUpdate}/headless_${buildId}_macosx.cocoa.x86_64.tar.gz
cp ${productroot}/org.eclipse.b3.product-win32.win32.x86_64.zip ${headlessUpdate}/headless_${buildId}_win32.win32.x86_64.zip

cp -r ${build_home}/p2repoSelfReport/reporeports ${headlessUpdate}/