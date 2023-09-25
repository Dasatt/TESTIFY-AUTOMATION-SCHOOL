/*You are to create 3 variables for a "square shape" class which will be "class A",
shapeSides (number of sides of the shape), shape length and shape breadth.
From your knowledge of encapsulation, create getters and setters for length and breadth
variables and create only a getter for shape side(this is because we don't want
anyone setting the sides of a square. the sides of the square must and always will be 4).
Create another class "B", set the values of length and breadth. Get the value of the length and
breadth and calculate the area. print out your final calculation like this.
"The area of a square of length: {put the value of the length} and breadth {put the value of the " +
"breadth} is {put the value of the area u calculated}"*/

public class Square {
    int shapeSides = 4;
    int length;
    int breadth;
    public int getShapeSides() {
        return shapeSides;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
