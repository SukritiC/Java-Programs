/**
 * 83. Remove Duplicates from Sorted List
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head,t1=null,h1 = null;
        List<Integer> binNum = new ArrayList<>();
        int num = 0;
        while(temp != null){
            binNum.add(temp.val);            
            temp = temp.next;
        }
        HashSet<Integer> hs = new HashSet<>(binNum);
        binNum = new ArrayList<>(hs);
        Collections.sort(binNum);
        if(binNum.size() > 0)
            h1 = new ListNode(binNum.get(0));
        temp = null;
        t1 = h1;
        for(int i=1;i<binNum.size();i++){
            temp = new ListNode(binNum.get(i));
            temp.next = null;
            t1.next = temp;
            t1 = t1.next;
        }
        return h1;
    }
}