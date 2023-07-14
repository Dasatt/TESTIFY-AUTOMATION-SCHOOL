/* Task Description - Sort an array of numbers in descending order */

//user provides an array separate with comma and function reverses the array


function sortNumbers(){
   const inputArray = prompt('Enter comma separated numbers to make up an array')//accept array entries from user
   let splitedArray = inputArray.split(',').map(Number)// split array entries by comma and convert to numbers
   //inbuilt sort() method works differently for Numbers, compare function needs to be parsed to sort function to define the order 

   // console.log(splitedArray) //inbuilt array function sort used to sort this ary
   function compareNumbers (a,b){
      //compare function is expected to work as thus - if +ve b is sorted before a, if -ve a is sorted before b if 0 numbers are the same
      if (b>a){
         return 1 // will sort in descending order 
      }else{         
         return -1
      }
   }

   splitedArray.sort(compareNumbers)
   
   console.log(splitedArray)
}
  