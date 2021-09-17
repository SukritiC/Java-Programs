/**
 * 1295. Find Numbers with Even Number of Digits
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */
class Solution {
    public int findNumbers(int[] nums) {
        int count  = 0;
        for(int i=0;i<nums.length;i++){
            int c = returnCount(nums[i]);
            if(c % 2 == 0)
                count++;
        }
        return count;
        
    }
    int returnCount(int num){
        int count = 0,t=num;
        while(t>0){
            count++;
            t /= 10;
        }
        return count;
    }
}