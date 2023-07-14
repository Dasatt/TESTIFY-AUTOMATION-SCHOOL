/* Task Description - Create a function filters Negative numbers */

//user provides an array separate with comma and function filters out the negative numbers which is returned in form of an array

function filterNegativeNumbers(){
   const inputArray = prompt('Enter comma separated numbers to make up an array')//accept array entries from user
   let splitedArray = inputArray.split(',').map(Number)// split array entries by comma and convert to Numbers
   let negativeNumbersArray = []

   for (i=0; i<splitedArray.length; i++){ //check if number is negative and add to the negative numbers array else do nothing
      if(splitedArray[i] < 0){
         let isNegative =splitedArray[i] //get the current entry at the end of the array
         negativeNumbersArray.push(isNegative) // add the entry to the new array
      }
   }
   console.log('The Negative Numbers in the array [' + splitedArray +'] provided are:')
   console.log(negativeNumbersArray)
}


