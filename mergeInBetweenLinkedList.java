/**
 * 1669. Merge In Between Linked Lists
 * You are given two linked lists: list1 and list2 of sizes n and m respectively.

Remove list1's nodes from the ath node to the bth node, and put list2 in their place.

The blue edges and nodes in the following figure incidate the result:
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1, t1 = null,t2 = null;          
        int pos = 0;
        while(pos < a){
            t1 = temp;
            temp = temp.next;
            pos ++;
        }
        t1.next = list2;
        t1 = t1.next;
        t2 = temp;
        while(t1.next != null ){
            t1 = t1.next;
        }
        while(pos <= b){
            temp = temp.next;
            pos++;
        }
        if(temp != null){
            t1.next = temp;
        }
        return list1;
    }
}