let myMap=new Map()
console.log(myMap,typeof(myMap))
myMap.set(1,"One")
myMap.set(2,"Two")
myMap.set(3,"Three")
myMap.set(4,"Four")
console.log(myMap,typeof(myMap))
for(let key of myMap.keys())
{
    console.log(key)
}
for(let key of myMap.values())
    {
        console.log(key)
    }
console.log(myMap.has(3))
for (let[key,value]of myMap)
{
    console.log(key,value)
}