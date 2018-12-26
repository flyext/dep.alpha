pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        jobDsl(targets: 'ivyJob.groovy')
        build 'example'
      }
    }
  }
}