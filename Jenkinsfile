pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        jobDsl(targets: 'workspace/dep.alpha_master/ivyJob.groovy', lookupStrategy: 'SEED_JOB', removedJobAction: 'DELETE', removedViewAction: 'DELETE', removedConfigFilesAction: 'DELETE')
      }
    }
  }
}