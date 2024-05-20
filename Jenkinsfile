pipeline {
    agent any

    environment {
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
                dir('api-spring') {
                    script {
                        // Verifique o conteúdo do diretório
                        sh 'ls -la'
                        // Execute o Maven
                        sh 'mvn clean compile'
                    }
                }
            }
        }

        stage('Test') {
            steps {
                dir('api-spring') {
                    script {
                        sh 'mvn test'
                    }
                }
            }
        }

        stage('Package') {
            steps {
                dir('api-spring') {
                    script {
                        sh 'mvn package -Dmaven.test.skip=true'
                    }
                }
            }
        }

        stage('Build Image') {
            steps {
                dir('api-spring') {
                    script {
                        sh 'docker build -t my-app:latest .'
                    }
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
