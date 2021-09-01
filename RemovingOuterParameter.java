/**
 * 
 * 1021. Remove Outermost Parentheses
 * Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.

Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
Example 1:

Input: s = "(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
 */

 
class Solution {
    public String removeOuterParentheses(String s) {
       int count =0;
        String fString = "";
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i) == '(' && count++ > 0){
                fString += s.charAt(i);
            }else if(s.charAt(i) == ')' && count-- > 1){                
                fString += ")";                
            }
            
        }
        return fString;
        
    }
}