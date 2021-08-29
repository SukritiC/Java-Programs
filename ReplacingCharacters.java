/*
* 1844. Replace All Digits with Characters

You are given a 0-indexed string s that has lowercase English letters in its even indices and digits in its odd indices.

There is a function shift(c, x), where c is a character and x is a digit, that returns the xth character after c.

For example, shift('a', 5) = 'f' and shift('x', 0) = 'x'.
For every odd index i, you want to replace the digit s[i] with shift(s[i-1], s[i]).

Return s after replacing all digits. It is guaranteed that shift(s[i-1], s[i]) will never exceed 'z'.

 

Example 1:

Input: s = "a1c1e1"
Output: "abcdef"
Explanation: The digits are replaced as follows:
- s[1] -> shift('a',1) = 'b'
- s[3] -> shift('c',1) = 'd'
- s[5] -> shift('e',1) = 'f'
*/

class Solution {
    public String replaceDigits(String s) {
        String s1="",s2="";
        for(int i=1;i<s.length();i=i+2){
            int num = Integer.parseInt(s.charAt(i)+"");
            char ch = shift(s.charAt(i-1),num);
            s1 += ch;
        }
        for(int i=0;i<s.length();i=i+2){
            s2 += s.charAt(i);
        }
        // System.out.println(s1);
        // System.out.println(s2);
        String finalString = "";
        int l=0,r=0;
        for(int i=0;i<s.length();i++){
            if(i%2 == 0 && l < s2.length()){
                finalString += s2.charAt(l);
                l++;
            }
            else if(i%2 == 1 && r < s1.length()){
                finalString += s1.charAt(r);
                r++;
                
            }
                
        }
        return finalString;
    }
    public char shift(char ch,int pl){
        int ch1 = ch + pl;
        return (char)ch1;
    }
}