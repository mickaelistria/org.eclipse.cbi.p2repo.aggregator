#!/usr/bin/env bash

# After we build, we will check the repository we just 
# produced, to make sure it is basically compliant. 
# This script is called direclty from "runTychoBuild.sh".

build_home=${WORKSPACE:-/home/davidw/gitCBI}
export tmp_dir=${build_home}/aggr/tmp
export local_mvn_repo=${build_home}/aggr/localMvnRepo
sourceProperties="${build_home}/mavenproperties.shsource"
repo_dir=${build_home}/org.eclipse.cbi.p2repo.aggregator

out_file=${build_home}/aggr/repoReportsTestOutput.txt

# This first write does not "append", the rest need to.
env | tee ${out_file}

# remove if it happens to exist
rm -fr ${build_home}/testarea
mkdir -p ${build_home}/testarea

pushd ${build_home}/testarea
wget -O org.eclipse.cbi.p2repo.analyzers.product-linux.gtk.x86_64.tar.gz  https://hudson.eclipse.org/cbi/job/cbi.p2repo.analyzers.build/lastSuccessfulBuild/artifact/output/products/org.eclipse.cbi.p2repo.analyzers.product-linux.gtk.x86_64.tar.gz
tar -xf org.eclipse.cbi.p2repo.analyzers.product-linux.gtk.x86_64.tar.gz

unzip ${build_home}/org.eclipse.cbi.p2repo.aggregator/org.eclipse.b3.site.eclipse/target/org.eclipse.b3.site.eclipse-1.0.0-SNAPSHOT.zip -d repoToTest
popd
# TODO: it is very awkward to have to update referenceRepo (in parent pom) so frequently 
source $sourceProperties
${build_home}/testarea/p2analyze -data workspace-report -vmargs -DreportRepoDir=${build_home}/testarea/repoToTest -DreferenceRepo=${referenceRepo}  -DreportOutputDir=${build_home}/p2repoSelfReport 2>&1 | tee -a ${out_file}
