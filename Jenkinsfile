pipeline {
    agent any

    stages {
        stage ('Build Image') {
            steps {
                script {
                    sh "${mvnHome}/bin/mvn --batch-mode compile clean install -U -Dmaven.test.skip=true"
                }
            }
        }
    }
}