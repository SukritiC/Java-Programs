/**
 * 704. Binary Search
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.
 */

class Solution {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        int index =  Arrays.binarySearch(nums,target);
        if(index < 0)
            return -1;
        return index;
    }
}