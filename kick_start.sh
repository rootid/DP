#!/bin/sh


#713,6,continue
#choose org.apache.maven.archetypes:maven-archetype-quickstart type project
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
  cd ${PWD}
  cd ${src_dir}
  java -cp target/${_artifactId}-${_version}.jar ${_classname}
  #java -cp target/simple-1.0-SNAPSHOT.jar org.sonatype.mavenbook.App
}

_artifactId=simple
_version=1.0-SNAPSHOT
_groupId=org.sonatype.mavenbook
_package=org.sonatype.mavenbook
_classname=org.sonatype.mavenbook.App


_artifactId=Observe
_version=1.0-SNAPSHOT
_groupId=org.vi.observer
_package=org.vi.observer
_classname=org.vi.observer.Init

src_dir=${_artifactId}

#generate 
compile
#run
