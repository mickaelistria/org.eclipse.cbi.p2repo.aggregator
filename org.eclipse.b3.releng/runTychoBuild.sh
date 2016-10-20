#!/usr/bin/env bash

build_home=${WORKSPACE:-/home/davidw/gitCBI/}
export tmp_dir=${build_home}/aggr/tmp
export local_mvn_repo=${build_home}/aggr/localMvnRepo

repo_dir=${build_home}/org.eclipse.cbi.p2repo.aggregator
export pom_dir=${repo_dir}/org.eclipse.b3.releng.parent

out_file=${build_home}/aggr/buildOutput.txt

# This first write does not "append", the rest need to.
env | tee ${out_file}

cleanLocal=$1

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

# Without the ANT_OPTS, we do get messages about "to get repeatable builds, to ignore sysclasspath"
export ANT_HOME=${ANT_HOME:-/shared/common/apache-ant-1.9.6}
export ANT_OPTS=${ANT_OPTS:-"-Dbuild.sysclasspath=ignore -Dincludeantruntime=false"}
export MAVEN_OPTS=${MAVEN_OPTS:--Xms1048m -Xmx2096m -Djava.io.tmpdir=${tmp_dir} -Dtycho.localArtifacts=ignore ${MIRROR_SETTING}}
export JAVA_HOME=/shared/common/jdk1.8.0_x64-latest
export JAVA_CMD=${JAVA_HOME}/jre/bin/java
export MAVEN_PATH=${MAVEN_PATH:-/shared/common/apache-maven-latest/bin}
export PATH=$JAVA_HOME/bin:$MAVEN_PATH:$ANT_HOME/bin:$PATH

cd ${pom_dir}

#printf "\n\t[INFO] %s\n\n" "Maven Version:" | tee -a ${out_file}
#mvn -version 2>&1 | tee -a ${out_file}

#printf "\n\t[INFO] %s\n\n" "Java Version:" | tee -a ${out_file}
#java -version 2>&1 | tee -a ${out_file}

printf "\n\t[INFO] %s\n\n" "mvn clean verify ...:" | tee -a ${out_file}
mvn clean verify -X -e -DskipTests=true -Dmaven.repo.local=$local_mvn_repo -Pbree-libs  2>&1 | tee -a ${out_file}

printf "\n\t[INFO] %s\n\n" "Build Output in ${out_file}"

