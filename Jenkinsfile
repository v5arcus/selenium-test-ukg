pipeline {

    agent any
    tools {
        maven 'maven_3_5_0' 
    }
    stages {

         stage('Checkout Code from Git') {
               steps {
        git 'https://github.com/SaumyaBhushan/Selenium_Test_Automation.git'
    }}

    stage('compile stage') {
             steps {
                bat "mvn clean compile"
        }
    }

         stage('testing stage') {
             steps {
                bat "mvn test"
        }
    }

  }

}
