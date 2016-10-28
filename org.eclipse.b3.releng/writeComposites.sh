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
    children=$(ls -1t ${repoRoot} | head -3)

    for child in $children
    do
        printf "%s%s%s\n" "    <child location='" $child "' />"  >> ${outfile}
    done

}


repoRoots=("/home/data/httpd/download.eclipse.org/cbi/updates/aggregator/ide/4.5" "/home/data/httpd/download.eclipse.org/cbi/updates/aggregator/headless/4.5")
# Normally "writeRepoRoots" is the same as "repoRoots", but might not always be, plus
# it is very handy for testing this script not to have to write to the "production" area.
#writeRepoRoots=("${PWD}/ide" "${PWD}/headless")
writeRepoRoots=${repoRoots}
indices=(0 1)
for index in ${indices[*]} 
do
    writeRepoRoot="${writeRepoRoots[$index]}"
    mkdir -p "${writeRepoRoot}"
    repoRoot="${repoRoots[$index]}"
    artifactsCompositeFile="${writeRepoRoot}/compositeArtifacts.xml"
    contentCompositeFile="${writeRepoRoot}/compositeContent.xml"
    p2Index="${writeRepoRoot}/p2.index"

    writeArtifactsHeader "${artifactsCompositeFile}"
    writeChildren "${artifactsCompositeFile}" "${repoRoot}"
    writeFooter "${artifactsCompositeFile}"

    writeContentHeader "${contentCompositeFile}"
    writeChildren "${contentCompositeFile}"
    writeFooter "${contentCompositeFile}"

    writeCompositeP2Index "${p2Index}"
done

