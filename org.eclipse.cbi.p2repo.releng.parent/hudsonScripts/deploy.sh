#!/usr/bin/env bash

# This job is ran after "runTychoBuild.sh" is ran in the "cleanAndDeploy" Hudson job.

# The default for build home is simply where I do my local build. Feel free to change in your local copy. 
build_home=${WORKSPACE:-/home/davidw/gitCBI}
propertiesfile="${build_home}/org.eclipse.cbi.p2repo.aggregator/org.eclipse.cbi.p2repo.cli.product/target/mavenproperties.properties"
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

DLRoot=/home/data/httpd
DLPath=/download.eclipse.org/cbi/updates/aggregator
baseDL=${DLRoot}/${DLPath}
ideUpdate=${baseDL}/ide/${updateRelease}/${buildId}
headlessUpdate=${baseDL}/headless/${updateRelease}/${buildId}

deployRepos ${ideUpdate} ${build_home}/org.eclipse.cbi.p2repo.aggregator/org.eclipse.cbi.p2repo.site.eclipse/target/repository
deployRepos ${headlessUpdate} ${build_home}/org.eclipse.cbi.p2repo.aggregator/org.eclipse.cbi.p2repo.cli.product/target/repository

# save away "data" from the build, as well as the deployable headless products
cp ${build_home}/aggr/buildOutput.txt ${headlessUpdate}
cp ${sourceProperties} ${headlessUpdate}
cp ${propertiesfile} ${headlessUpdate}
cp ${phpProperties} ${headlessUpdate}

windowsProd=headless_${buildId}_win32.win32.x86_64.zip
linuxProd=headless_${buildId}_linux.gtk.x86_64.tar.gz
macProd=headless_${buildId}_macosx.cocoa.x86_64.tar.gz

productroot=${build_home}/org.eclipse.cbi.p2repo.aggregator/org.eclipse.cbi.p2repo.cli.product/target/products
cp ${productroot}/org.eclipse.cbi.p2repo.cli.product-linux.gtk.x86_64.tar.gz ${headlessUpdate}/${linuxProd}
cp ${productroot}/org.eclipse.cbi.p2repo.cli.product-macosx.cocoa.x86_64.tar.gz ${headlessUpdate}/${macProd}
cp ${productroot}/org.eclipse.cbi.p2repo.cli.product-win32.win32.x86_64.zip ${headlessUpdate}/${windowsProd}

cp -r ${build_home}/reporeports ${headlessUpdate}/


# create an easy to read file for location of these specific repositories
# TODOeventually should turn this into a proper "download page"
DLpage=${build_home}/buildResults.html
echo "<p>Results of build: <a href=\"../${buildId}\">${buildId}</a></p>" > ${DLpage}
# First echo, above, starts new page. The rest must append to DLpage.
echo "<p>repositories specific for this build: </p>" >> ${DLpage}
echo "<ul>" >> ${DLpage}
echo "<li> For IDE repo: <a href=\"http://${DLPath}/ide/${updateRelease}/${buildId}\">http://${DLPath}/ide/${updateRelease}/${buildId}</a></li>" >> ${DLpage}
echo "<li> For headless CLI product repo: <a href=\"http://${DLPath}/headless/${updateRelease}/${buildId}\">http://${DLPath}/headless/${updateRelease}/${buildId}</a></li>" >> ${DLpage}
echo "</ul>" >> ${DLpage}

echo "<p>The downloadable CLI products:</p>" >> ${DLpage}
echo "<ul>" >> ${DLpage}
echo "<li> Windows: <a href=\"http://${DLPath}/headless/${updateRelease}/${buildId}/${windowsProd}\">${windowsProd}</a></li>" >> ${DLpage}
echo "<li> Linux: <a href=\"http://${DLPath}/headless/${updateRelease}/${buildId}/${linuxProd}\">${linuxProd}</a></li>" >> ${DLpage}
echo "<li> Mac OSX: <a href=\"http://${DLPath}/headless/${updateRelease}/${buildId}/${macProd}\">${macProd}</a></li>" >> ${DLpage}
echo "</ul>" >> ${DLpage}
echo "<p>For release engineering, be sure to check the <a href=\"http://${DLPath}/headless/${updateRelease}/${buildId}/reporeports\">\"repo reports\"</a> from this build</p>" >> ${DLpage}

cp ${DLpage} ${headlessUpdate}
cp ${DLpage} ${ideUpdate}
