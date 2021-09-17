/**
 * 1464. Maximum Product of Two Elements in an Array
 * Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 */
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length-1;
        return (nums[l]-1)*(nums[l-1]-1);
    }
}