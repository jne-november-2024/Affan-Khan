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
            resolve("Data From Function 2...")
    
        },5000)
    }
    )}
let function3=()=>
        { return new Promise((resolve,reject)=>{
            setTimeout(()=>{
                resolve("Data From Function 3...")
        
            },5000)
        }
        )}
Promise.all([function1(),function2(),function3()]).then((message)=>
{
 console.log(" Data from all function  "+message)
})
.catch((error)=>
{
    console.log(" Error from all function  "+error)
})