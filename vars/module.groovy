def call() {
    pipeline {
        agent any

        stages {
            stage('Build') {
                steps {
                    logger.log constants.PREPARE()
                }
            }
            stage('Build') {
                steps {
                    logger.log constants.BUILD()
                }
            }
            stage('Test') {
                steps {
                    logger.log constants.TEST()
                }
            }
            stage('Deploy') {
                steps {
                    logger.log constants.DEPLOY()
                }
            }
        }
    }
}
return this