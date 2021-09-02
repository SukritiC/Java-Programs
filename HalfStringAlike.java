/**
 * 
 * 1704. Determine if String Halves Are Alike
 * You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowelsNotice that s contains uppercase and lowercase letters. Return true if a and b are alike. Otherwise, return false.

Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
 */

class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int length = s.length();
        int mid = length/2;
        int lCount = 0, rCount = 0;
        for(int i=0;i<mid;i++){
            if(vowels.contains(s.charAt(i)))
                lCount++;
        }
        for(int i=mid;i<s.length();i++){
            if(vowels.contains(s.charAt(i)))
                rCount++;
        }
        if( lCount == rCount)
            return true;
        return false;
    }
}