/* Task Description - Print a table containing multiplication table */

//Table will be dynamic, width of table is determined by user, while height of table remains 12, the standard multiplication table height



function printMultiplicationTable(){
   deleteRows() //helps reset the table enteries before a new request
   const sizeOfTable = parseInt(prompt("Enter a number for the multiplication table size")) //this determines the width of the table i.e no of columns in the table (cells per row)
   for (i=0; i<12; i++){
      let tableRows = document.getElementById('multiplicationTable').insertRow(-1)  //number of rows to be created is by default twel, hence in the outer loop
      
      for(j=0; j<sizeOfTable; j++){//for loop to create cells in each row based on the size of table from user, this defines the number of columns
         let cell = tableRows.insertCell(-1); ///cells to be inserted sizeofTable times
         cell.innerHTML = j+1 +"x"+ (i+1) +" = " + (j+1) * (i+1) // for each cell write the text showing what is being multiplied and the result
      }     
   }
}

/* function deleteRows resets the table row entries byt deleting all rows of multiplication table
created when a user clicks the button to generate new table */
function deleteRows(){
   const multiplicationTable = document.getElementById('multiplicationTable')
   const numberOfRows = multiplicationTable.rows.length
   if (numberOfRows > 0){
      for(i = 0; i<numberOfRows; i++){ //based on number of rows delete row 0 continuously
         multiplicationTable.deleteRow(0)
      }
   }
}
          
