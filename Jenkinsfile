pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        withAnt(installation: 'Main', jdk: 'Main') {
          echo 'Ok'
        }

        load 'ivyJob.groovy'
      }
    }
  }
}