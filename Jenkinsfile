pipeline {
    agent any

    environment {
        MVN_HOME = tool name: 'Maven 3', type: 'maven'
    }

    stages {
        stage('Clean Workspace') {
            steps {
                cleanWs()
            }
        }

        stage('Build') {
            steps {
                script {
                    sh "${MVN_HOME}/bin/mvn clean compile"
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    sh "${MVN_HOME}/bin/mvn test"
                }
            }
        }

        stage('Package') {
            steps {
                script {
                    sh "${MVN_HOME}/bin/mvn package -Dmaven.test.skip=true"
                }
            }
        }

        stage('Build Image') {
            steps {
                script {
                    // Substitua pelo comando para construir a imagem Docker, se necessário
                    sh 'docker build -t my-app:latest .'
                }
            }
        }
    }

    post {
        success {
            echo 'Build completed successfully!'
            // Adicione notificação de sucesso aqui, se necessário
        }
        failure {
            echo 'Build failed!'
            // Adicione notificação de falha aqui, se necessário
        }
    }
}
