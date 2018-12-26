pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        jobDsl(targets: '**/ivyJob.groovy', lookupStrategy: 'SEED_JOB', removedJobAction: 'DELETE', removedViewAction: 'DELETE', removedConfigFilesAction: 'DELETE')
      }
    }
  }
}