let myPromise=new Promise((resolve,reject)=>
{
    let success=true;
    setTimeout(()=>
    { if (success)
    {
        resolve("Success")
    }
    else{
        reject(" Failed")
    }

    },5000)
})
myPromise.then((message)=>
{
console.log(" The promise is in then "+message)
}).catch((error)=>
{
    console.log(" The promise is in catch "+message)
})