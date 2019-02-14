import constants.Constants

def call() {
    pipeline {
        agent any

        stages {
            stage('Build') {
                steps {
                    echo Constants.BUILD
                }
            }
            stage('Test') {
                steps {
                    echo 'Testing..'
                }
            }
            stage('Deploy') {
                steps {
                    echo 'Deploying....'
                }
            }
        }
    }
}
return this