def call(Map config = [:]){
    scriptLoad(name: 'script.sh')
    sh "./script.sh  ${config.experience} ${config.name}"
}