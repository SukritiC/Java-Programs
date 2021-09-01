/*
* 344. Reverse String
Write a function that reverses a string. The input string is given as an array of characters s.
Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Follow up: Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 */

class Solution {
    public void reverseString(char[] s) {
        int start = 0, end = s.length-1;
        while (start < end)
        {
            // XOR for swapping the variable
            s[start] ^= s[end];
            s[end] ^= s[start];
            s[start] ^= s[end];

            ++start;
            --end;
        }
    
    }
}