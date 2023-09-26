//2.	Reverse the position of words in "I am the best Automation Tester" using recursion:
public class ReverseWords {
    public void reverseWords(String inputWord) {
        String[] words = inputWord.split(" ");
        String reversedString ="";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString = reversedString+words[i]+" ";
        }
        System.out.println(reversedString);
    }
}
