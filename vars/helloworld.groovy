def call(Map config = [:]){
    scriptLoad(name: 'script.sh')
    sh "./script.sh ${config.name} ${config.experience}"
}