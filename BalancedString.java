/*
1221. Split a String in Balanced Strings

Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it in the maximum amount of balanced strings.

Return the maximum amount of split balanced strings.

Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
*/

import java.util.*;
class Solution {
    public int balancedStringSplit(String s) {
        Stack<Character> Lst = new Stack<>();
        Stack<Character> Rst = new Stack<>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'L'){
                Lst.push('L');
            }else if(s.charAt(i) == 'R'){
                Rst.push('R');
            }
            if(Lst.size() == Rst.size()){
                count ++;
                Lst.clear();
                Rst.clear();
            }
        }
        return count;
    }
}