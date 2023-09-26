/*6.	Using  Java  Code,  check  for  Anagrams  in  these  strings:
 "Despite commuting at the peek hour, she was able to keep to time" */

import java.util.*;

public class AnagramBuckets{

    public void findAnagrams(String inputStatement){
        Map<String, List<String>> anagramBuckets = new HashMap<>();
        String [] inputArray = inputStatement.split(" ");
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
        for (List<String> anagramSet : anagramBuckets.values()){
            if (anagramSet.size() > 1 ){
                System.out.println(anagramSet);
            }
        }
    }


}
