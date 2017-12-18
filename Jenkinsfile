
// Build Variable
def topic_label = ''
def repo_artifactId = ''
pipeline {
    agent any

    stages {
    
            stage('init') {
            steps {
                checkout scm
            }
        }
         stage('Build src') {
            steps {
                sh "mvn -f pom.xml deploy"
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