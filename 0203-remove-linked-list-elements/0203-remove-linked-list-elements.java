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

        ListNode tail=head;
        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;
        prev.next=head;

        while(tail!=null){

            if(tail.val==val){
                prev.next=tail.next;
            }
            else{
            prev=tail;
         
            }
            tail=tail.next;



        }

        return dummy.next;
        
    }
}
