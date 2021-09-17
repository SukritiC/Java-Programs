/**
 * 35. Search Insert Position
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = Arrays.binarySearch(nums,target);
        if(i < 0)
            return 0-i-1;
        return i;
    }
}