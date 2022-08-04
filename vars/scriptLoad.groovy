def call(Map config = [:]){
    def script = libraryResource "com/scripts/${config.name}"
    writeFile file: "${config.name}", text: script
    sh "chmod a+x ./${config.name}"
}