async function weather()
{
 let dweather=new  Promise((resolve,reject)=>
{
    setTimeout(()=>{
   resolve("27 degree")
    },2000)
})
let mweather=new Promise((resolve,reject)=>{

    setTimeout(()=>
    {
   resolve(" 25 deg")
    },8000)
}
)
console.log("fetching delhi weather...")
let delhhiw=await dweather
console.log("the delhi weather is "+delhhiw)
console.log("fetching mumbai weather...")
let mumbaiw=await mweather
console.log("the mumbai weather is "+mumbaiw)
}

console.log(" before async function calling...")
weather()
