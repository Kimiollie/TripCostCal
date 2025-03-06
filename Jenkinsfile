pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Kimiollie/TripCostCal.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}