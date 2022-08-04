def call(){
    call(null)
    echo "first call called"
}

def call(Map params){
    if (params == null){
        params = [:]
    }
    params.status = 'INPROGRESS'
    else{
        echo "params caught"
    }
    echo "second call called"
}