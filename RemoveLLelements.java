/**
 * 203. Remove Linked List Elements
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head, t1;   
        List<Integer> binNum = new ArrayList<>();
        // int num = 0;
        while(temp != null){
            binNum.add(temp.val);            
            temp = temp.next;
        }
        if (binNum.contains(val)){
            Integer num = val;
            binNum.removeAll(Collections.singleton(num));
            if(binNum.size() > 0){
                t1 = new ListNode(binNum.get(0));
                t1.next = null;
                head = t1;
                for(int i =1;i<binNum.size();i++){
                    temp = new ListNode(binNum.get(i));
                    temp.next = null;
                    t1.next = temp;
                    t1 = temp;

                }
            }else {
                    head = null;
                }           
        }
        return head;
        
    }
}