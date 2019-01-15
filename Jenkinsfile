pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        build 'AlphaIvy'
      }
    }
    stage('Time') {
      steps {
        timestamps()
      }
    }
    stage('Tag') {
      steps {
        echo 'Ok'
      }
    }
  }
}