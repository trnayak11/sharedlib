def call(Map config = [:]){
    sh "echo ${config.name} has ${config.experience} years of experience"
}