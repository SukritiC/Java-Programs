/*
1528. Shuffle String
Given a string s and an integer array indices of the same length.

The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.

Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
*/

import java.util.*;
class Solution {
    public String restoreString(String s, int[] indices) {
        Map<Integer, Character> hm = new TreeMap<>();
        int i=0;
        for(int a:indices){
            hm.put((Integer)a,s.charAt(i));
            i++;
        }
        String s1 = "";
        for (Map.Entry<Integer, Character> entry : hm.entrySet()){
            s1 += entry.getValue();
        }       
                
        return s1;
    }
}