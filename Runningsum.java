/**
 * 1480. Running Sum of 1d Array
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
 */
class Solution {
    public int[] runningSum(int[] nums) {
        int sum[] = new int[nums.length];
        int s = 0;
        for(int i=0;i<nums.length;i++){
            s += nums[i];
            sum[i] = s;
        }
        return sum;
    }
}