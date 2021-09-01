/*
* 804. Unique Morse Code Words
Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.

For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word.
Return the number of different transformations among all words we have.

Example 1:

Input: words = ["gin","zen","gig","msg"]
Output: 2
Explanation: The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."
There are 2 different transformations: "--...-." and "--...--.".
*/

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morse_code[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        List<String> mcode = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String word="";
            for(int j=0;j<words[i].length();j++){
                int ascii = words[i].charAt(j);
                word += morse_code[ascii-97];
            }
            mcode.add(word);            
        }
        Set<String> hSet = new HashSet<String>();
        for (String x : mcode)
            hSet.add(x);
        return hSet.size();
    }
}