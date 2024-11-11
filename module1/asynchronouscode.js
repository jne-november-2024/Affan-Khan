const fun1=()=>
{
console.log("fun1 start")
setTimeout(()=>
{
    console.log(" 2 mins waiting ....")
},2000)
console.log("fun1 end")
}
fun1();