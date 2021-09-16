/**
 * 1470. Shuffle the Array
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[nums.length];
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            a1.add(nums[i]);              
        }
        for(int i=n;i<nums.length;i++){
            a2.add(nums[i]);              
        }
        int l = 0,r = 0,i=0;
        while(i<nums.length){
            if(i%2==0 && l < a1.size()){
                arr[i] = a1.get(l);
                i++;
                l++;
            }else if(r < a2.size()){
                arr[i] = a2.get(r);
                i++;
                r++;                
            }
        }
        
        return arr;
    }
}