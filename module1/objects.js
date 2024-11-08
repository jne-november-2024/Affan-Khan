let mysym=Symbol('key1')
let user=
{
    firstname :'Affan',
    lastname:'Khan',
    age:24,
    [mysym]:'myky1',
    city:'Pune',
    gmail:'affan.khan@thinkitive.com'
}

console.log(user.firstname,user.age)
console.log(user['gmail'],user['city'],user[mysym])
user.greeting=function()
{
    console.log("in greeting function hello...")

}
console.log(user.greeting)