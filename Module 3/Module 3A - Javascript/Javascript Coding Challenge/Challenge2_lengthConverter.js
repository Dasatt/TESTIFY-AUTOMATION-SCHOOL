/* Task Description - Create a length Converter Function */

//Function is to convert Metres to feet

function metreConverter(){
     const numberInMetres = parseFloat(prompt("Enter a length in metres"))
     //1 metre = 3.28084feets
     const numberInFeet = numberInMetres * 3.28084
     
     if (numberInFeet == 1){
        alert(numberInMetres+' metres '+ 'is equal to '+ numberInFeet +' foot')//manage plural /singular :) 
     }else{
        alert(numberInMetres+' metre '+ 'is equal to '+ numberInFeet +' feet')
     }
    
}
