pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'feature/java-code', url: 'https://github.com/prathxm/jenkins-java-demo.git'
            }
        }

        stage('Build') {
            steps {
                echo '🏗️ Building the project...'
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                echo '🧪 Running unit tests...'
                bat 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Deploy') {
            steps {
                echo '🚀 Deploying the project...'
                bat '''
                if not exist deploy mkdir deploy
                copy target\\*.jar deploy\\
                '''
                echo '✅ Deployment completed — .jar copied to deploy folder.'
            }
        }
    }

    post {
        success {
            echo '🎉 Pipeline completed successfully!'
        }
        failure {
            echo '❌ Pipeline failed.'
        }
    }
}
