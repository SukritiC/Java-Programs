/**
 * 876. Middle of the Linked List
 * Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.
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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head, t1;   
        List<Integer> binNum = new ArrayList<>();
        int num = 0;
        while(temp != null){
            binNum.add(temp.val);            
            temp = temp.next;
        }
        temp = head;
        int mid = binNum.size()/2;
        int i = 0;
        while(i < mid){
            t1 = temp;
            System.out.print(temp.val);
            temp = temp.next;
            t1.next = null;            
            i++;
        }
        head = temp;
        return head;
        
        
    }
}