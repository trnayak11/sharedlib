def call() {
	
    //def jobName = env.JOB_NAME
    String jobName = "newjob"
	def buildNumber = env.BUILD_NUMBER.toInteger()
	def currentJob = Jenkins.instance.getItemByFullName(jobName)

	def stoppedBuild = false
    echo "${jobName}"
}