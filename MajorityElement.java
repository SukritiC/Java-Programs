/**
 * 169. Majority Element
 * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */

import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int a:nums){
            if(mp.containsKey(a)){
                mp.put(a,mp.get(a)+1);
            }else{
                mp.put(a, 1);
            }
        }
        int maxValueInMap=(Collections.max(mp.values()));
        int key = 0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                key = entry.getKey();     // Print the key with max value
            }
        }
        return key;
    }
}