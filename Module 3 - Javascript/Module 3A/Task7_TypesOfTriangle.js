// Types of Triangle
const side1 = 5
const side2 = 5
const side3 = 5

if (side1 === side2 && side2 === side3){
    console.log("This is an EQUILATERAL triangle")
}else if(side1 === side2 || side1 === side3 || side2 === side3){
    console.log("This is an ISOSCELES triangle")
}else{
    console.log("This is a SCALENE triangle")
}
