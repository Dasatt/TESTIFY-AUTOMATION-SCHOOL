/*Create anagram buckets from a given input array of words:input is
{"akka", "akak", "baab", "baba", "bbaa"}
 */
/* ALgorithm used -=>
Create a hashmap such that for each word in the list, you sort, use the sorted word as a key in the hashmap
and put the initial word in a list which is the value for the initial sortedword,
repeat for all words to create a key->list map

* */

import java.util.*;

public class AnagramBuckets{

    public List<List<String>> groupAnagrams(String [] inputArray){
        Map<String, List<String>> anagramBuckets = new HashMap<>();
        for(String str:inputArray ){
            char [] ArrayOfChar = str.toCharArray();
            Arrays.sort(ArrayOfChar); // for each word in the input aray sort the characters
            String sortedString = String.valueOf(ArrayOfChar); //convert character array back to strings
            //if this sorted string does not already exist as a key in the map, then create a new key->vlaue in the bucket
            if(!anagramBuckets.containsKey(sortedString)){
                anagramBuckets.put(sortedString, new ArrayList<>());
            }
            anagramBuckets.get(sortedString).add(str); // add the str word to the value(list) of key sorted string
        }
        return new ArrayList<>(anagramBuckets.values()) ;
    }


}
