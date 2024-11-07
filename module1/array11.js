let arr=[1,2,3,4,5]
let arr2=arr.map(num=>num*2)
console.log(arr)
console.log(arr2)
console.log(arr2,typeof(arr2))
let users = [
    { name: 'Alice', age: 25 ,surname:'jaw'},
    { name: 'Bob', age: 30 ,surname:'jaden'},
    { name: 'Charlie', age: 35 ,surname:'jade'},
    { name: 'jack', age: 36 ,surname:'jade'},
  ];
let f=users.map((users)=>
users.age+=1)
console.log(f)
let f1=users.map((users)=>
users.name)
console.log(f1)

let f3=users.filter(user=> (user.age >34) && (user.surname='jade'))


console.log(f3,typeof(f3))
let numbers = [5, 125, 8, 130, 44];
let newn=numbers.filter(x=>(x<12))
console.log(newn)
let even=numbers.filter(x=>x%2==0)
console.log(even)
const numbers1 = [1, 2, 3, 4, 5];

const sum = numbers1.reduce((accumulator, currentValue) => {
  return accumulator + currentValue;
}, 0); 

console.log(sum,typeof(sum)); 
let d=numbers.some(x=>x>100)
console.log(d,typeof(d))
let e=numbers.every(x=>x>0)
console.log(e,typeof(e))