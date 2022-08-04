def call(){
    call(experience:8,name:"trupti")
    echo "first call called"
}

def call(Map params){
    if (params == null){
        params = [:]
    }
    else{
        echo "params caught"
    }
    echo "second call called"
}