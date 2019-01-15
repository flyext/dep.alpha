pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        build 'AlphaIvy'
      }
    }
    stage('Tag') {
      steps {
        emailext(subject: 'Tag', body: '?!', from: 'flyext@gmail.com', to: 'flyext@gmail.com')
      }
    }
  }
}