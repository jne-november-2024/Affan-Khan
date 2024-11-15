let user=
{
    name:{
        firstname:"Affan",
        lastname:'Khan'
    },
    age:24,
    city:"pune",
    email:"affan.khn@thinkitive.com",

}
console.log(user.name.firstname,user.name.lastname)
console.log(user.age,user.city)
let obj1={1:"a",2:"a"}
console.log(obj1,typeof(obj1))
let obj2={3:"c",4:"d"}
console.log(obj2,typeof(obj2))
let obj3={...obj1,...obj2}
console.log(obj3,typeof(obj3))