let function1=()=>
    { return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve("Data From Function 1...")
    
        },5000)
    }
    )}
    let function2=()=>
        { return new Promise((resolve,reject)=>{
            setTimeout(()=>{
                reject("Data From Function 2 is not available ...")
        
            },5000)
        }
        )}
   
    Promise.all([function1(),function2(),]).then((message)=>
    {
     console.log(" Data from all function  "+message)
    })
    .catch((error)=>
    {
        console.log(" Error from all function  "+error)
    })