#!/bin/bash


#713,6,continue
#choose org.apache.maven.archetypes:maven-archetype-quickstart type project
OLD_PWD=${PWD}
SRC_LST=(Creational Structural Behvioral)

generate () {
mvn archetype:generate \
  -DgroupId=${_groupId} \
  -DartifactId=${_artifactId} \
  -Dpackage=${_package} \
  -Dversion=${_version}
}

compile() {
  cd ${src_dir}
  mvn install
}

run() {
  cd ${OLD_PWD}
  cd ${src_dir}
  java -cp target/${_artifactId}-${_version}.jar ${_classname}
}


#set -x
for type_ in ${SRC_LST[@]}
do
  pkg_="org.vi."
  l_type=`echo ${type_} | tr '[:upper:]' [':lower:]'`
  pkg_+=${l_type}
  _artifactId=${type_}
  _version=1.0-SNAPSHOT
  _groupId=${pkg_}
  _package=${pkg_}
  _classname=${pkg_}.App
  src_dir=${_artifactId}
  generate 
  compile
  run
  cd ${OLD_PWD}
done

exit 0

