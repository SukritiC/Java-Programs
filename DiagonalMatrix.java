/**
 * 1572. Matrix Diagonal Sum
 * Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
 */
class Solution {
    public int diagonalSum(int[][] mat) {
        int count = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i == j){
                    count +=  mat[i][j];
                    continue;
                }                    
                if(i+j == mat.length-1){
                    count += mat[i][j];
                }                    
            }
        }
        return count;
    }
}