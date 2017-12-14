
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
                sh "mvn -f pom.xml -s setting.xml clean"
                sh "mvn -f pom.xml -s setting.xml package -Dmaven.test.skip=true -DreleaseVersion=${CONST_RELEASE_VERSION}-${topic_label}"
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