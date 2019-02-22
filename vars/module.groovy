def call() {
    pipeline {
        agent any

        stages {
            stage('Prepare') {
                steps {
                    script {
                        logger.log constants.PREPARE()
                    }
                }
            }
            stage('Build') {
                steps {
                    script {
                        logger.log constants.BUILD()
                    }
                }
            }
            stage('Test') {
                steps {
                    script {
                        logger.log constants.TEST()
                    }
                }
            }
            stage('Deploy') {
                steps {
                    script {
                        logger.log constants.DEPLOY()
                    }
                }
            }
        }
    }
}
return this