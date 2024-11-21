function fun1()
{
 console.log(" in fun1 started...")
    let p = new Promise((resolve,reject)=>
    {
     let sucess=true;
     if (sucess)
     {
        resolve("Task is completed")
     }
     else
     {
        reject("something went wrong")
     }


    });
    p.then((result)=>
    {
        console.log(result)
    })
    p.catch((error)=>
    {
        console.log(error)
    })
    console.log("fun1 is ending...")
}
fun1();