/**
 * 326. Power of Three
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
An integer n is a power of three, if there exists an integer x such that n == 3x.
 */
class Solution {
    public boolean isPowerOfThree(int n) {
         if (n <= 0)
            return false;
        /* The maximum power of 3 value that
           integer can hold is 1162261467 ( 3^19 ) .*/
        return 1162261467 % n == 0;
    }
}