let course=["python","java","html"]
console.log(course,typeof(course))
course.unshift('javascript')
console.log(course)
course.push('react')
console.log(course)
course.shift()
console.log(course)
course.pop()
console.log(course)
course.push('dotnet')
course.push('typescript')
let newa=course.slice(1,3)
console.log(newa)
let newb=course.slice()
console.log(newb,typeof(newb),newb.length)

let arr2=[45,"delhi",45.65,false]
let arr=[3,5,87,"pune"]
console.log(arr2.concat(arr))
let arr3=arr.reverse()
console.log(arr3)
let s=arr3.includes("punee")
console.log(s)