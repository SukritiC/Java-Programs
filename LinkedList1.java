/**
 * 1290. Convert Binary Number in a Linked List to Integer
 * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.
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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        List<Integer> binNum = new ArrayList<>();
        int num = 0;
        while(temp != null){
            binNum.add(temp.val);            
            temp = temp.next;
        }
        int j=0;
        for(int i=binNum.size()-1;i>=0;i--){
            
            num += Math.pow(2,j)*binNum.get(i);
            j++;
        }
        return num;
    }
}