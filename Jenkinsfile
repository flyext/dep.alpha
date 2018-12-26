pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        withAnt(installation: 'Main', jdk: 'Main') {
          echo 'Ok'
        }

        jobDsl(targets: '\'ivyJob.groovy\'', lookupStrategy: 'SEED_JOB', removedJobAction: 'DELETE', removedViewAction: 'DELETE', removedConfigFilesAction: 'DELETE')
      }
    }
  }
}