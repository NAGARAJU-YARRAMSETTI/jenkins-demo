pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {

        stage('Clone Code') {
            steps {
                git branch: 'main',
                url: 'https://github.com/NAGARAJU-YARRAMSETTI/jenkins-demo.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'ls target'
            }
        }
    }
}

