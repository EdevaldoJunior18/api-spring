pipeline {
    agent any

    environment {
        // Configurar o Maven com o nome usado no Jenkins
        MVN_HOME = tool name: 'Maven 3', type: 'maven'
        PATH = "${MVN_HOME}/bin:${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Clean Workspace') {
            steps {
                cleanWs()
            }
        }

        stage('Build') {
            steps {
                script {
                    // Verifique o conteúdo do diretório
                    sh 'ls -la'
                    // Execute o Maven usando apenas 'mvn' pois o PATH já foi atualizado
                    sh 'mvn clean compile'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    sh 'mvn test'
                }
            }
        }

        stage('Package') {
            steps {
                script {
                    sh 'mvn package -Dmaven.test.skip=true'
                }
            }
        }

        stage('Build Image') {
            steps {
                script {
                    sh 'docker build -t my-app:latest .'
                }
            }
        }
    }

    post {
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
