/**
 * 1588. Sum of All Odd Length Subarrays
 * Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.
A subarray is a contiguous subsequence of the array.
Return the sum of all odd-length subarrays of arr.

Efficient Approach: To optimize the above approach, the idea is to observe the following pattern after generating all the subarrays of odd length:

For any element at index idx there are (idx + 1) choices on the left side of it and (N – idx) choices on the right side of it.
Therefore, for any element arr[i], the count of arr[i] is (i + 1) * (N – i) in all the subarrays.
So, for an element arr[i], there are ((i + 1) * (N – i) + 1) / 2 sub-arrays with odd length.
Finally, arr[i] will have a total of ((i + 1) * (n – i) + 1) / 2 frequency in the sum.
Therefore, to find the sum of all elements of all the subarrays of odd length, the idea is to iterate over the array and for every ith array element, add [((i + 1) * (n – i) + 1) / 2]*arr[i] to the sum.
 */
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0; 
        // Size of array
        int l = arr.length;
        // Traverse the given array arr[]
        for(int i = 0; i < l; i++){
            // Add to the sum for each
            // contribution of the arr[i]
            sum += (((i + 1) * (l - i) +
                     1) / 2) * arr[i];
        }
        return sum;
    }
}