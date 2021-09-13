/**
 * 328. Odd Even Linked List
 * Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity
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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head, t1= null;
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        int n=0;
        while(temp != null ){
            // System.out.print(tevn.val+" ");
            if (n%2 == 0)
                odd.add(temp.val);  
            else{
                even.add(temp.val);
            }
            temp = temp.next;
            n++;
        }
        // System.out.println(odd+" "+even);
        odd.addAll(even);
        if(odd.size() > 0){
            temp = new ListNode(odd.get(0));
            temp.next =null;
        }
        head = temp;
        for(int i=1;i<odd.size();i++){
            t1 = new ListNode(odd.get(i));
            t1.next = null;
            temp.next = t1;
            temp = t1;            
        }
        return head;
        
    }
}