public class CheckPalindrome {
    public void checkPalindrome(String text){
        String reverseText = "";

        for(int i = text.length()-1; i>=0; i--){
            reverseText+=text.charAt(i);
        }
        if (text.equalsIgnoreCase(reverseText)){
            System.out.println(text+" is a Palindrome");
        }else{
            System.out.println(text+" is NOT a Palindrome");
        }
    }

    public void checkPalindrome(int number){
        String text = Integer.toString(number);
        String reverseText = "";

        for(int i = text.length()-1; i>=0; i--){
            reverseText+=text.charAt(i);
        }
        if (text.equalsIgnoreCase(reverseText)){
            System.out.println(text+" is a Palindrome");
        }else{
            System.out.println(text+" is NOT a Palindrome");
        }
    }

}
