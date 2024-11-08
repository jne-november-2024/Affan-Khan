let fruits = ["apple", "banana", "cherry"];
console.log(fruits,typeof(fruits))
let numbers = new Array(1, 2, 3, 4);
console.log(numbers,typeof(numbers))
let  numbers1=[1,2,3,4]
console.log(numbers,typeof(numbers))
console.log(numbers==numbers1)
console.log(numbers===numbers1)

let colors=["red","green","yellow"]
console.log(colors,typeof(colors))
console.log(colors[1],colors[3])
colors[2]="violet"
console.log(colors,typeof(colors))
colors.push("black")
console.log(colors,typeof(colors))
colors.unshift("white")
console.log(colors,typeof(colors))
let colors1=colors.slice(2,4)
console.log(colors1,typeof(colors1))
let num=0;
colors.forEach(function(num)
{
    console.log(num)
})
let numbers4=[1,2,3,4,5]
console.log(numbers4)
let numbers5 = numbers4.map(function(num) {
    return num * 2;
  });
  console.log(numbers5);
let numbers6=numbers4.filter(function(num)
{
    return num%2===0;
})
console.log(numbers6,typeof(numbers6))
let fruits1=["apple,banana","guava","mango"]
let fruits2=fruits.filter(function(fruit)
{
    return fruit.length>5
})
console.log(fruits2,typeof(fruits2))
let odd=numbers4.filter(function(num)
 {return num%2!=0;
});
console.log(odd)
let nestedArray = [1, 2, [3, 4],[23,45,[65,767],56],[5, 6]];
let newa=nestedArray.flat(2)
console.log(newa,typeof(newa))