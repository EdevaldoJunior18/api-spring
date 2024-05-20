pipeline {
    agent any

    environment {
        MVN_HOME = tool name: 'Maven 3', type: 'maven'
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Verifica se o repositório Git existe e o branch está correto
                    checkout([$class: 'GitSCM', branches: [[name: '*/main']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/EdevaldoJunior18/api-spring.git']]])
                }
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
                    dir('api-spring') { // Certifique-se de que está no diretório correto
                        sh "${MVN_HOME}/bin/mvn clean compile"
                    }
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    dir('api-spring') { // Certifique-se de que está no diretório correto
                        sh "${MVN_HOME}/bin/mvn test"
                    }
                }
            }
        }

        stage('Package') {
            steps {
                script {
                    dir('api-spring') { // Certifique-se de que está no diretório correto
                        sh "${MVN_HOME}/bin/mvn package -Dmaven.test.skip=true"
                    }
                }
            }
        }

        stage('Build Image') {
            steps {
                script {
                    dir('api-spring') { // Certifique-se de que está no diretório correto
                        sh 'docker build -t my-app:latest .'
                    }
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
