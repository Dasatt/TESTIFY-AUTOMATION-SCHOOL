// alert ('Hello World')

// const copare =

/* 
AND --> && all must be true  
OR --> || either must be trye
NOT --> ! toggles boolean values
*/

/*const age = 15

if (age>=18){
    console.log("You are eligible to vote")
} else{
    console.log("You are not eligible to vote")
}

// const emptyArray = []
// console.log(emptyArray)
// emptyArray.push(12,14)

const notEmpty =[1,2,3,4]
console.log(notEmpty.length)
for (i=0; i<notEmpty.length; i++){
    notEmpty.pop()
    console.log('i popped' + i)
}
console.log(notEmpty)*/

const myObject = {name: 'car', colour:'red', price:250000}
const door = {
    isOpen: false,
    material:'wood',
    height:8,
    toggleOpeAndClose: function(){
        if (door.isOpen === true){
            door.isOpen = false
        }else{
            door.isOpen = true
        }
    }
}
console.log(door.isOpen)
door.toggleOpeAndClose()
console.log(door.isOpen)