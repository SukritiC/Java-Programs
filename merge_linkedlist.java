/**
 * 21. Merge Two Sorted Lists
 * Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode t1 = l1, t2 = l2;
        int c1=0,c2=0;
        while(t1 != null){
            c1++;
            t1 = t1.next;
        }
        while(t2 != null){
            c2++;
            t2 = t2.next;
        }
        t1 = l1;
        t2 = l2;
        int r=0,l=0;
        ArrayList<Integer> al = new ArrayList<>();
        while(r <= c1 && l <= c2 && t1 != null && t2 != null){
            if(t1.val < t2.val){
                al.add(t1.val);
                t1 = t1.next;
                r++;
            }else{
                al.add(t2.val);
                t2 = t2.next;
                l++;
            }
        }
        if(t1 != null){
            while(t1 != null){
                al.add(t1.val);
                t1 = t1.next;
            }
        }else if(t2 != null){
            while(t2 != null){
                al.add(t2.val);
                t2 = t2.next;
            }
        }
        System.out.println(al);
        ListNode head = null;
        if(al.size() > 0){
            ListNode flist = new ListNode(al.get(0));        
            ListNode temp = null;
            head = flist;
            for(int i=1;i<al.size();i++){
                temp = new ListNode(al.get(i));
                temp.next = null;
                flist.next = temp;
                flist = flist.next;
            }
        }
        return head;
    }
}