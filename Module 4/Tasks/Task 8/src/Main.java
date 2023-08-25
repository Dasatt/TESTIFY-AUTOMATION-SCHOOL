import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Build a Simple interest calculator.
        Write a program to ask the user for the necessary field you need in calculating the
        simple interest and then communicate the simple interest back to the user is a good sentence*/

        // Simple interest = PRT/100
        System.out.println("Welcome to Simple Interest calculator");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter the Principal Amount");
        float principal = userInput.nextFloat();
        System.out.println("Please Enter the interest rate per annum");
        float rate = userInput.nextFloat();
        System.out.println("Please Enter the time in months");
        float time = userInput.nextFloat();

        float interest = principal*rate*time/(100*12);
        System.out.println("The Simple interest for principal of "+principal+ " at interest rate of "+rate+"% per annum "
        +"for a period of "+ time+ " months is : " + interest);




    }
}