/*OVERLOADING: Create a method in a class and Overload in using the 3 different ways of overloading
that you know.*/


public class Food {
    public void buyFood(){

    }
    public void buyFood(String name){
        System.out.println(name);
    }
    public void buyFood(int numberOfPlates){
        System.out.println(numberOfPlates);
    }


    public void buyFood(String name, int plateNumber){
        System.out.println(plateNumber);
    }
    public void buyFood(int plateNumber, String name){
        System.out.println(plateNumber+" plates of  "+name);
    }

    public static void main(String[] args) {
        Food newOrder = new Food();
        newOrder.buyFood(2,"Rice");
    }
}
