def call(){
    call(null)
    echo "first call called"
}

def call(Map params){
    if (params == null){
        params = [:]
        echo "null passed"
    }
    else{
        echo "params caught"
    }
    echo "second call called"
}

def call(){
    call(null)
    echo "third call called"
}
