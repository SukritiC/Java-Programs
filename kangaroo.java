/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Hp
 * You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).

The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.

For example, kangaroo 1 starts at x1=2 with a jump distance v1=1 and kangaroo 2 starts at x2=1 with a jump distance of v2=2 . After one jump, they are both at x=3,
* (x1+v1=2+1,x2+v2=1+2 ), so our answer is YES.

Function Description

Complete the function kangaroo in the editor below. It should return YES if they reach the same position at the same time, or NO if they don't.

kangaroo has the following parameter(s):

x1, v1: integers, starting position and jump distance for kangaroo 1
x2, v2: integers, starting position and jump distance for kangaroo 2
 */
public class kangaroo {

    public static void main(String[] args) {
        int x1 = 14, v1 = 4, x2 = 98, v2 = 2,ctr=0;
        String s = "";
        while (true) {
            x1 += v1;
            x2 += v2;
            ctr++;
            System.out.println(ctr);
            if (x1 == x2) {
                System.out.println("YES");
                break;
            } else if (x1 > 10 * x2 || x2 > 10 * x1) {
                System.out.println(x1+" "+x2);
                System.out.println("NO");
                break;
            } else {
            }

        }
    }

}
