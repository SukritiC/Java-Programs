/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * Roy wanted to increase his typing speed for programming contests. His friend suggested that he type the sentence 
 * "The quick brown fox jumps over the lazy dog" repeatedly. This sentence is known as a pangram because it contains every letter of the alphabet.

After typing the sentence several times, Roy became bored with it so he started to look for other pangrams.

Given a sentence, determine whether it is a pangram. Ignore case.
 */
public class pangrams {
    public static void main(String[] args) {
        String s="We promptly judged antique ivory buckles for the next prie";
         s=s.toLowerCase();
        String msg="pangram";
        
        int arr[]=new int[123];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        for(int i=97;i<123;i++){
            if(arr[i]==0){
                 msg="not pangram";
                 break;
            }
        }
        
        System.out.println(msg);

    }
}
