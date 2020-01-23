pipeline {
    agent any 
    stages {
        stage('Build') {
            steps {
                echo 'Building....'
                sh 'mvn --version'
            }
        }
        stage('Publish Build Artifacts') {
            steps {
                echo 'Publish Build Artifacts'
                archiveArtifacts 'project/target/*.war'
            }
        }
        stage('CI') {
            steps {
                echo 'CI'
            }
        }
        stage('CD') {
            steps {
                echo 'CD'
            }
        }
    }
}
