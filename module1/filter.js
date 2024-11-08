let arr=[56,78,67,45]
let arr2=arr.filter(function(num)
{
return num%2===0
})
console.log(arr2,typeof(arr2))

let arr3=arr.map(function(num)
{return num*2}); 
console.log(arr3,typeof(arr3))