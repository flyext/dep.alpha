pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        def timestampBefore = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())
        echo 'Before:${timestampBefore}'
        build 'AlphaIvy'
        def timestampAfter = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())
        echo 'After:${timestampAfter}'
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