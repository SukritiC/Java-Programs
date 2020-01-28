/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.*;

/**
 *
 * Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.

Original alphabet:      abcdefghijklmnopqrstuvwxyz
Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
 */
public class Alpha {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = "159357lcfd";
        int k=98;
        String c="";
        if(k>25){
            if(k%26==0){
                k=0;
            }else{
                k=k%26;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            int j=0;
            int ch=s.charAt(i);
            //System.out.print(ch+",");
            if(ch>=65&&ch<=90&&(ch+k)>90){
                j=(ch+k)-90;
                //
                j+=64;
                if(j>90){
                    j=64+(j-90);
                }
            }else if(ch>=97&&ch<=122&&(ch+k)>122){
                j=(ch+k)-122;
                //System.out.print(j+",");
                j+=96;
                if(j>122){
                    j=96+(j-122);
                }
                //System.out.print(j+" @");
            }else if((ch>=97&&ch<=122)||(ch>=65&&ch<=90)){
                j=ch+k;
                if((ch>=65&&ch<=90)&&j>90){
                    j=64+(j-90);
                }
                else if((ch>=97&&ch<=122)&&j>122){
                    j=96+(j-122);
                }else{}
            }else{
                j=ch;
            }
             c=c+(char)j+"";
           // System.out.print(c.toLowerCase());
        }
        //return c;
        System.out.println(c);
    }
}