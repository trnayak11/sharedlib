def call() {
	
    def jobName = env.JOB_NAME
    //def jobName = "newjob"
	def buildNumber = env.BUILD_NUMBER.toInteger()
	def currentJob = Jenkins.instance.getItemByFullName(jobName)
    def stat = currentBuild.currentResult
	def stoppedBuild = false
    echo "${jobName}"
    echo "${buildNumber}"
    echo "${currentJob}"
    echo "${stat}"
}