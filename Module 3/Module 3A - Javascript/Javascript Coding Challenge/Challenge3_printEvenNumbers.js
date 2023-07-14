/* Task Description - Print Even Numbers from 0-100 */



function printEvenNumbers(){
     for (i = 0; i<=100; i++){
      if (i % 2 == 0){ // even number is divisible by 2 with no remainder i.e modulus is 0
         console.log(i)
      }
     }    
}
