/**
 * 206. Reverse Linked List
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head,t1=null;        
        List<Integer> binNum = new ArrayList<>();
        int num = 0;
        while(temp != null){
            binNum.add(temp.val);            
            temp = temp.next;
        }
        ListNode h1 = null;
        if(binNum.size() > 0)
            h1 = new ListNode(binNum.get(binNum.size()-1));
        temp = h1;
        for(int i = binNum.size()-2;i >= 0;i--){
            t1 = new ListNode(binNum.get(i));
            temp.next = t1;
            t1.next = null;
            temp = temp.next;
        }
        return h1;
    }
}