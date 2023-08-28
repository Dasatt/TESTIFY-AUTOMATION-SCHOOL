import java.util.Scanner;

public class Main {
//    Create a method that verify that visitors on the slack channel are
//    coming for testify Trainings. If they write" Testify" then print out a  welcome messsage if not ,
//    the user should be shown rejection message. after creating this method,then invoke the created
//    method in your main method

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main mainObject = new Main();
        System.out.println("Enter the code word to verify you:");
        String userInput = scanner.nextLine();
        mainObject.verifyVisitor(userInput);

    }
    public void verifyVisitor(String userInput){
        if(userInput.equalsIgnoreCase("Testify")){
            System.out.println("Welcome to Testify Academy!!!");
        }else{
            System.out.println("Wrong code! You cannot be granted access to this Channel");
        }
    }


}