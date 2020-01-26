/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * A number in a range You are given an array containing N distinct integers. 
 * You want to perform M queries of this array. Each query must be of the following form:
 * L R X K: You have to find the element in the range [l,r] which is kth greater from Ax . 
 * Note: If the answer doesn't exist, print "-1"
 */
import java.util.*;

public class KthGreater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking Inputs 
        System.out.println("Enter the value of N & Q");
        int n = sc.nextInt();
        int q = sc.nextInt();
        System.out.println("Enter " + n + " elements");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            System.out.println("Enter the Value of L,R,X,K respectively");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            int num = KthGreater.Kgreatest(a, x, k, a.length);
            if (num >= l && num <= r) {
                System.out.println(num);
            } else {
                System.out.println(-1);
            }
        }
    }

    public static int Kgreatest(int n[], int x, int k, int s) {
        int c = 0;
        int i = x - 1;
        int ans = 0;
        while (i < (s - 1)) {
            if (c == k) {
                break;
            }
            if (n[i] < n[i + 1]) {
                ans = n[i + 1];
                c++;
                i++;
            } else {
                i++;
            }
        }
        return ans;
    }
}
