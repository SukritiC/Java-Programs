/**
 * 136. Single Number
Add to List

Share
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> n1 = new ArrayList<Integer>();   
        for( int i=0;i<nums.length;i++)
            n1.add(nums[i]);
        Collections.sort(n1);
       for( int i=0;i<n1.size();i++)
            nums[i] = n1.get(i);
        int ans = -1;
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        for (int i = 0; i < n; i += 2) {
            if (i != n-1 && nums[i] != nums[i + 1]) {
                ans = nums[i];
                break;
            }
        }
       
        if (nums[n - 2] != nums[n - 1])
            ans = nums[n-1];
        return ans;
    }
}