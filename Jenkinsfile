pipeline {
  agent any
  stages {
    stage('Run build') {
      steps {
        build(job: 'AlphaIvy', propagate: true)
      }
    }
  }
}