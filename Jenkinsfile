pipeline {
    agent any

    environment {
        MAVEN_HOME = 'C:\Program Files\Maven'
    }

    stages {
        stage('Checkout') {
            steps {
                // Clone the repository
                git branch: 'master', url: 'https://github.com/Trizmera/user-camere.git'
            }
        }

        stage('Build') {
            steps {
                // Run Maven build
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                // Run tests
                sh 'mvn test'
            }
        }

        stage('Archive') {
            steps {
                // Archive the JAR file
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }

    post {
        success {
            echo 'Build and Deployment Successful!'
        }
        failure {
            echo 'Build or Deployment Failed!'
        }
    }
}
