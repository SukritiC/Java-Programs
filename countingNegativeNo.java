/**
 * 1351. Count Negative Numbers in a Sorted Matrix
 * Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
 */

import java.util.*;
class Solution {
    public int countNegatives(int[][] grid) {
        List<Integer> al = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                al.add(grid[i][j]);
            }
        }
        Collections.sort(al);
        int i=0,count =0;
        if(al.size() > 0){
            while(i < al.size() && al.get(i) < 0){
                count++;
                i++;
            }
        }        
        return count;
    }
}