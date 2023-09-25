/*Create anagram buckets from a given input array of words:input is
{"akka", "akak", "baab", "baba", "bbaa"}
 */
public class Main {
    public static void main(String[] args) {
        AnagramBuckets obj = new AnagramBuckets();
        System.out.println(obj.groupAnagrams(new String[]{"akka", "akak", "baab", "baba", "bbaa"}));

    }
}