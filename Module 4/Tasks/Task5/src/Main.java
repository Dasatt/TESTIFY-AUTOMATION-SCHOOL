public class Main {
    public static void main(String[] args) {
        /*Write a code to: If the number is divisible by 3, print Fizz instead of the number.
                If the number is divisible by 5, print Buzz instead of the number.
                If the number is divisible by 3 and 5 both, print FizzBuzz instead of the number.*/
        // test code runs through 1 -200 to achieve this

        for (int i = 0; i<=200; i++){
            if (i%3 == 0){
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            } else if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }

    }
}