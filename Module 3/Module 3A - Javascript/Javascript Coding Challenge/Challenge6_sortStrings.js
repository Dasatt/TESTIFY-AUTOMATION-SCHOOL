/* Task Description - Create a function that reverses an array */

//user provides an array separate with comma and function reverses the array


function sortStrings(){
   const inputArray = prompt('Enter comma separated string of texts to make up an array')//accept array entries from user
   let splitedArray = inputArray.split(',')// split array entries by comma 
   console.log(splitedArray.sort()) //inbuilt array function sort used to sort this ary

}
  