import java.text.SimpleDateFormat

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
        script {
          def dateformat = new SimpleDateFormat("yyyyMMddHHmmss")
          def timestamp = dateformat.format(new Date())
          echo 'Result:${timestamp}'
        }
      }
    }
  }
}