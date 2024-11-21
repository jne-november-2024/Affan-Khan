let p=new Promise((resolve,reject)=>
{
    let a=1;
    a=1+1;
    if(a===2)
    {
        resolve("solved")
    }
    else{
        reject(" Failed")
    }
});
p.then((message)=>
{
    console.log("this is the message from promise "+  message)
}
).catch((message)=>
{
    console.log("this is the message from promise "+  message)
})