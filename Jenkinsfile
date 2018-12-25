pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        build(job: 'AlphaIvy', quietPeriod: 60, wait: true)
      }
    }
  }
}