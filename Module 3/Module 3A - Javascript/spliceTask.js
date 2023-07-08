const months = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'June', 'July', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']

//Remove Jan - March
months.splice(0,3)

console.log(months)

//months.splice(4,2) what will be the returned array

returnedArray = months.splice(4,2)
console.log(returnedArray)

//what will be the modified array 
console.log(months)

