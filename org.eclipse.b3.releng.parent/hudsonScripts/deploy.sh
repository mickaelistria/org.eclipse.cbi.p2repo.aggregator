#!/usr/bin/env bash

# The default for build home is simply where I do my local build. Feel free to change in your local copy. 
build_home=${WORKSPACE:-/home/davidw/gitCBI}
propertiesfile="${build_home}/org.eclipse.cbi.p2repo.aggregator/org.eclipse.b3.product/target/mavenproperties.properties"
sourceProperties="${build_home}/mavenproperties.shsource"


function convertProperties
{
  file=$1
  outfile=$2  
  if [ -f "$file" ]
  then
    #echo -e "\n[DEBUG] properties found at expected location: \n\t$file\n"
    echo "# Ant properties translated to bash shell variables" > $outfile
    while IFS='=' read -r key value
    do
      # Technically, we only need 'buildId' and 'updateRelease' for now (no periods in var name) so 
      # we do not need the space and period translations. But, would in more
      # complicated cases.
      if [[ -n $key ]] 
      then
        key=$(echo $key | tr ' ' '_')
        key=$(echo $key | tr '.' '_')
        key=$(echo $key | tr '-' '_')
        eval "${key}=\"${value}\""
        #echo -e "[DEBUG] key   =" ${key}
        #echo -e "[DEBUG] value =" ${value}
        # we quote to account for spaces in values
        echo "${key}=\"${value}\"" >> $outfile
      fi
    done < "$file"
    echo -e "\n[INFO] source properties created in $outfile\n"
  else
    echo -e "\n[ERROR] property file not found at expected location: \n\t$file\n"
  fi
}

function deployRepos
{
  newRepo=$1
  builtRepo=$2
  mkdir -p ${newRepo}
  cp -r ${builtRepo}/* ${newRepo}/

  #TODO: make composite, add mirror URL, etc.
}

convertProperties $propertiesfile $sourceProperties

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

