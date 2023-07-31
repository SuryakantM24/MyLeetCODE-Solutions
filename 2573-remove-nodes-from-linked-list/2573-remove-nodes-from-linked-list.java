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

    public ListNode reverse(ListNode head){
        ListNode prev=null,curr=head,next=head;

        while(curr!=null){
            next=next.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public ListNode removeNodes(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        
        ListNode prev=null;
        ListNode temp1=reverse(head),temp2=temp1;
       
        int max=0;
        while(temp1!=null){

            if(temp1.val>=max){
                max=temp1.val;
                prev=temp1;
            }
            else{
                prev.next=temp1.next;
            }

            temp1=temp1.next;
        }
        return reverse(temp2);     
    }
}


