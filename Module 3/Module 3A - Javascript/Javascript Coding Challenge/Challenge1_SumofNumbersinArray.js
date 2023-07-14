/* Task Description - Calculate the sum of numbers within an array */

function sumOfArray(){
    const inputArray = prompt('Enter comma separated numbers to make up an array')//accept numbers from user
    const arrayofNumbers = inputArray.split(',').map(Number) // split numbers by , and convert to an array of number type
    let sum = 0 // initialise the variable sum to be used for storing the total 

    // loop through the array and add each element to sum, 
    for (i = 0; i<arrayofNumbers.length; i++){
        sum +=arrayofNumbers[i]
    }
    alert('Sum of the Numbers entered is '+ sum)
    
}
