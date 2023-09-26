//2.	Reverse the position of words in "I am the best Automation Tester" using recursion:
public class ReverseString {

    public void reverseString(String text){
        if (text == ""){
            System.out.println(text);
        }else {
            System.out.print(text.charAt(text.length()-1));
            reverseString(text.substring(0,text.length()-1));
        }
    }
}
