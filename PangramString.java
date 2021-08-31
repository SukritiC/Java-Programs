/*
* 1832. Check if the Sentence Is Pangram
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
*/

import java.util.*;
class Solution {
    public boolean checkIfPangram(String sentence) {
        List<Character> alphabet = new ArrayList<>();
        for(int i=0;i<sentence.length();i++){
            alphabet.add(sentence.charAt(i));
        }
        String ch = "abcdefghijklmnopqrstuvwxyz";
        int flag = 0;
        for(int i=0;i<ch.length();i++){
            if(!alphabet.contains(ch.charAt(i))){
                flag = 1;
                break;
            }
        }
        // System.out.println(alphabet);
        if (flag == 1)
            return false;
        return true;
    }
}