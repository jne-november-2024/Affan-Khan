let str1="Hello World!!!"
console.log(str1.length)
console.log(str1.charAt(4))
console.log(str1.indexOf('l'))
console.log(str1.toUpperCase())
console.log(str1.toLowerCase())
let str2="good morning everyone"

let str3="Javascript is the best language "
console.log("-----",str3.slice(-4,-1))
console.log(str3.replace('a','t'))
console.log(str3.replaceAll('a','t'))
console.log(str3)
str3=str3.trim()
let str4=str3.split(" ")
console.log(str4,typeof(str4))
console.log(str3.includes('its'))
let st5=new String("hello")
let st6="hello"
console.log(st5==st6)
console.log(st5===st6)