

const user=new Object()

user.id="abc2323"
user.name="Affan khan"
user.age=24
user.city='pune'
console.log(user)
let regularuser=
{
    email:'xyz@gmail.com',
    fullname:
    {
        userfullname:{
            firstname:'rahul',
            lastname:'shetty'
        }
    }
}
console.log(regularuser['fullname']['userfullname']['firstname'])

let obj2={1:'a',2:'b'}
let obj3={3:'p',4:'y'}
// let obj5=Object.assign(obj2,obj3)
let obj5={...obj2,...obj3}
console.log(obj5)