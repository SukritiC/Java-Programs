/**
 * 
 * 1816. Truncate Sentence
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.

Example 1:

Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".
 */

 
import java.util.*;
class Solution {
    public String truncateSentence(String s, int k) {
        List<String> words = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s," ");
        String s1="";
        while(st.hasMoreTokens()){
            words.add(st.nextToken());
        }
        for(int i=0;i<k;i++){
            s1 += words.get(i)+" ";
        }
        return s1.trim();
    }
}