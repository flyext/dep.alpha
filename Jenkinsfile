import java.text.SimpleDateFormat

pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        script {
          def dateformat1 = new SimpleDateFormat("yyyyMMddHHmmss")
          def timestamp1 = dateformat1.format(new Date())
          println "Result1: ${timestamp1}"
        }
        build 'AlphaIvy'
        script {
          def dateformat2 = new SimpleDateFormat("yyyyMMddHHmmss")
          def timestamp2 = dateformat2.format(new Date())
          println "Result2: ${timestamp2}"
        }
      }
    }
    stage('Tag') {
      steps {
        script {
          def dateformat = new SimpleDateFormat("yyyyMMddHHmmss")
          def timestamp = dateformat.format(new Date())
          println "Result: ${timestamp}"
        }
      }
    }
  }
}