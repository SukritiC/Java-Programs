/**
 * 1313. Decompress Run-Length Encoded List
 * We are given a list nums of integers representing a list compressed with run-length encoding.

Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.

Return the decompressed list.
 */
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int l = nums.length;
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> temp = null;
        for(int i=0;i<l;i = i+2){
            temp = new ArrayList<>();
            int j = 0;
            while(j<nums[i]){
                temp.add(nums[i+1]);
                j++;
            }
            al.add(temp);            
        }
        int count = 0;
        for(int i=0;i<al.size();i++){
            for(int j=0; j<al.get(i).size();j++){
                count ++;
            }
        }
        int t[] = new int[count];
        int k=0;
        for(int i=0;i<al.size();i++){
            for(int j=0; j<al.get(i).size();j++){
                t[k] = al.get(i).get(j);
                k++;
            }
        }
        return t;
    }
}