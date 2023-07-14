/* Task Description - Create a function that reverses an array */

//user provides an array separate with comma and function reverses the array


function checkDivisibility (inputNumber){
   if (inputNumber % 10 === 0){
      return true
   }else{
      return false
   }
}

function runCheck(){ //function to call the check divisibilit function and log the returned result
   const inputNumber = parseInt(prompt('Enter a number(an integer) to check its divisibility')) // receive number for use and ensure its an integer
   divisibility = checkDivisibility(inputNumber)
   console.log(divisibility)
   if (divisibility){
      console.log(inputNumber + ' is divisible by 10')
   }else{
      console.log(inputNumber+' is not divisible by 10')
   }
}

