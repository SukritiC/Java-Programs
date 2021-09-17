/**
 * 1304. Find N Unique Integers Sum up to Zero
 * Given an integer n, return any array containing n unique integers such that they add up to 0.
 */
class Solution {
    public int[] sumZero(int N) {
        List<Integer> al = new ArrayList<>();
        for (int i = 1; i <= N / 2; i++)
        {
            // Print 2 symmetric numbers
                al.add(i);
                int a = 0-i;
                al.add(a);
            // System.out.print(i + ", " + -i + ", ");
        }

        // Print a extra 0 if N is odd
        if (N % 2 == 1)
            al.add(0);
        int a[] = new int[al.size()];
        for(int i=0;i<al.size();i++)
            a[i] = al.get(i);
        return a;
    }       
}