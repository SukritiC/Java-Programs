/**
 * Calculating the fibonacci series using dynamic programming concept memoization with recursion. Complexity O(n)
 * @author Hp
 */
import java.util.*;
public class fibonacciSeq {    
    static int lookup[]=new int[100];    
    public static void main(String[] args) {        
        Arrays.fill(lookup,-1);
        System.out.println(new fibonacciSeq().fib(10));
    }
    int fib(int x){
        if(lookup[x]==-1){
            if(x<=1){
                lookup[x]=x;
            }else{
                lookup[x]=fib(x-1)+fib(x-2);
            }
        }
        return lookup[x];
    }
}
