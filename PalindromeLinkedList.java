/**
 * 234. Palindrome Linked List
 * Given the head of a singly linked list, return true if it is a palindrome.
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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head,t1=null,h1 = null;
        String num = "";
        while(temp != null){
            num += temp.val;            
            temp = temp.next;
        }
        String onum = num;
        StringBuilder sb= new StringBuilder(onum);        
        StringBuilder num2 = sb.reverse();
        String n = num2.toString();
        System.out.println(num2);
        // System.out.println()
        if (num.equals(n))
            return true;
        return false;
    }
}