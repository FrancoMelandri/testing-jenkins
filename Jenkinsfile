// @Library("testing-jenkins") _
// module()

    println ('>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>')
    println (params.Target)
    println ('<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<')
    pipeline {
        agent any

        stages {
            stage('Build') {
                steps {
                    echo 'Building..'
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

