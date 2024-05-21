pipeline {
    agent any

    environment {
        MVN_HOME = '/usr/bin'
        PATH = "${MVN_HOME}:${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Realiza o checkout do código
                    //teste
                    checkout([
                        $class: 'GitSCM',
                        branches: [[name: '*/main']],
                        userRemoteConfigs: [[
                            url: 'https://github.com/EdevaldoJunior18/api-spring',
                            credentialsId: '915a442b-7342-4ade-9485-b5814ab03d47'
                        ]]
                    ])
                }
            }
        }

        stage('Build') {
            steps {
                dir('api-spring') {
                    script {
                        sh 'ls -la'
                        sh 'mvn clean install'
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
