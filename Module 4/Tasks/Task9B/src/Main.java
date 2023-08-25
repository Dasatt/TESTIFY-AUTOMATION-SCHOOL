import java.util.Scanner;
//Write a logic that takes in input from the user. It keeps printing "try again "until the user enters "testify"


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        while (true){
            if(!userInput.equalsIgnoreCase("testify")){
                System.out.println("Enter this company's name to end this loop!!");
                userInput = scanner.nextLine();
            } else if (userInput.equalsIgnoreCase("testify")) {
                System.out.println("Lucky you this loop has now ended!!");
                break;
            }
            System.out.println("Try again!!!");
        }

    }
}