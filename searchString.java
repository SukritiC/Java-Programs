/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * We say that a string contains the word hackerrank if a subsequence of its characters spell the word hackerrank. For example, 
 * if string s="haacckkerrannkk" it does contain hackerrank, but s="hac"  does not. 
 * In the second case, the second r is missing. 
 
 */
public class searchString {

    public static void main(String[] args) {
        String sa[] = {"knarrekcah",
            "hackerrank",
            "hackeronek",
            "abcdefghijklmnopqrstuvwxyz",
            "rhackerank",
            "ahankercka",
            "hacakaeararanaka",
            "hhhhaaaaackkkkerrrrrrrrank",
            "crackerhackerknar",
            "hhhackkerbanker"};
        String s1 = "", s2 = "hackerrank", msg = "";

        for (String s:sa) {
            int j = 0;s1="";            
            for (int i = 0; i < s.length(); i++) {
                if (j < s2.length()) {
                    char ch = s2.charAt(j);
                    if (ch == s.charAt(i)) {
                        s1 += s.charAt(i);
                        j++;
                    }
                }
            }
            if (s1.equals(s2)) {
                msg = "YES";
            } else {
                msg = "NO";
            }

            System.out.println(msg);
        }
    }
}
