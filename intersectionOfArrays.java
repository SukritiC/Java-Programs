/**
 * 349. Intersection of Two Arrays
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
 */
import java.util.stream.Collectors;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> al = new ArrayList<>();
        List<Integer> al1 = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            al.add(nums1[i]);
        }
         for(int i=0;i<nums2.length;i++){
            al1.add(nums2[i]);
        }
        al.retainAll(al1);
        System.out.println(al);	
        Set<Integer> s1 = new HashSet<>(al);
        // Set<Integer> s2 = convertListToSet(al1);
        al = new ArrayList<Integer>(s1);
        // al1 = new ArrayList<Integer>(s2);
        int n[] = new int[0];
        System.out.println(al.size());
        if(al.size() > 0){
            n = new int[al.size()];
            for(int i=0;i<al.size();i++){
                n[i] = al.get(i);
            }
        }
        
        return n;
        
    }
}