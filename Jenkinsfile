pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        withAnt(jdk: '10.0.2', installation: '1.10.5')
      }
    }
  }
}