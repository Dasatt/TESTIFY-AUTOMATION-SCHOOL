/*Write a code that asks the user for age and that accepts the Integer value.
Handle the error that is encountered when the users tries to enter a name instead of age
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter your age");
        try{
            int age = userInput.nextInt();
            System.out.println("Your age is " + age);
        }catch (java.util.InputMismatchException ageError){
            System.out.println("Sorry that is not a number, Enter a number");
        }

    }

}