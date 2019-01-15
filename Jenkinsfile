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
        def timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())
        echo 'Result:${timestamp}'
      }
    }
  }
}