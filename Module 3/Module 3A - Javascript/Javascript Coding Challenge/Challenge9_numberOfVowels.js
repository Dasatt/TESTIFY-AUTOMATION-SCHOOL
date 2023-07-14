/* Task Description - Return the vowels in a string*/

//user provides an array separate with comma and function reverses the array


function countVowels(){
   const vowels = ['a', 'e', 'i', 'o', 'u'] // store the vowels in an alphabet
   let numberOfVowels = 0  //initialise vowel count, to be incremented on confirmation of vowels
   let inputString = prompt('Enter a a text (string) to count the number of vowels') // receive input from user  
   inputString = inputString.toLowerCase() //takes all letters of input sting to lower case as includes() method used later on is case sensitive
   
   for (i = 0; i<inputString.length; i++){
      let letter = inputString[i]  // stores the letter at each string index
      if (vowels.includes(letter)){ // .includes inbuilt function in arrays used to check if the vowels area contains this particular letter
         numberOfVowels++ // number of vowels counter is incremented if true, else do nothing
         console.log(letter)
      }
   }
   console.log('The number of vowels in string ' + inputString + '  is '+ numberOfVowels)
}


