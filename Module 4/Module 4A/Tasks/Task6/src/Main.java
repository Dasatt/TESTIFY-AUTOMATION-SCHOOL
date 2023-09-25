public class Main {
    public static void main(String[] args) {
        //Write a code to reverse the string DEMOCRACY and get the word COME out of it.

        String word = "DEMOCRACY";
        String reversed = "";
        String stringCome ="";

        for (int i = word.length()-1; i>=0; i--){
            reversed+=word.charAt(i);
        }
        System.out.println("Reversed stringis: " + reversed);
        stringCome = reversed.substring(4,8);
        System.out.println("Substring is: " + stringCome);
    }

}