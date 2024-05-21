pipeline {
    agent any

    environment {
        MVN_HOME = '/usr/bin'
        PATH = "${MVN_HOME}:${env.PATH}"
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
                        sh 'ls -la'
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
