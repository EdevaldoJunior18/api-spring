pipeline {
    agent any

    environment {
        MVN_HOME = tool name: 'Maven 3', type: 'maven'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], userRemoteConfigs: [[url: 'https://github.com/EdevaldoJunior18/api-spring.git']]])
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
                    // Ajuste este caminho se o pom.xml não estiver na raiz do repositório
                    dir('api-spring') { 
                        sh "${MVN_HOME}/bin/mvn clean compile"
                    }
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    dir('api-spring') { 
                        sh "${MVN_HOME}/bin/mvn test"
                    }
                }
            }
        }

        stage('Package') {
            steps {
                script {
                    dir('api-spring') { 
                        sh "${MVN_HOME}/bin/mvn package -Dmaven.test.skip=true"
                    }
                }
            }
        }

        stage('Build Image') {
            steps {
                script {
                    dir('api-spring') { 
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
