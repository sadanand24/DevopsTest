node{
	stage('git checkout'){
	    git credentialsId: 'gitpwd', url: 'https://github.com/sadanand24/DevopsTest.git'
	}
	
	stage('mvn clean'){
	    def mavenHome = tool name: 'maven1', type: 'maven'
	    def mavenCMD = "${mavenHome}/bin/mvn"
            sh "${mavenCMD} clean"
	}
	
	stage('mvn build, test, package'){
	    def mavenHome = tool name: 'maven1', type: 'maven'
            def mavenCMD = "${mavenHome}/bin/mvn"
            sh "${mavenCMD} package"
	}
	
	stage('mvn install'){
	    sh 'mvn install'
	}
	
	stage('docker build'){
	    sh 'docker build -t sadanand24/cicd:1.0.0 .'
	}
	
	stage('docker push'){
	    withCredentials([string(credentialsId: 'dockerpwd', variable: 'docker-secrets')]) {
            sh "docker login -u sadanand24 -p ${docker-secrets}"
            }
	    sh 'docker push sadanand24/cicd:1.0.0'
	}
	
	stage('docker pull'){
	    sh 'docker pull sadanand24/cicd:1.0.0'
	}
	
	stage('docker run'){
	    sh 'docker run -p 8888:8080 -d sadanand24/cicd:1.0.0'
	}
}
