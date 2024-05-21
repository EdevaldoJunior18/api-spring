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
                script {
                    sh 'ls -la'
                    sh 'mvn clean compile'
                }
            }
        }

         stage('Deploy') {
            steps {
                script {
                    sh 'ls -la'
                    sh 'mvn spring-boot:run'
                }
            }
        }
    }
}
