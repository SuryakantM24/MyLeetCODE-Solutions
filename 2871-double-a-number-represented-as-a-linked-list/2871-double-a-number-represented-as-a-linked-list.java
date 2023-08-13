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
        ListNode prev=null,curr=head,forward=head;

        while(curr!=null){
            forward=forward.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }

        return prev;
    }
    public ListNode doubleIt(ListNode head) {


        ListNode head2=reverse(head);
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
        while(head2!=null){
            int digit=carry;

            digit+=2*head2.val;

            ListNode newNode=new ListNode(digit%10);
            carry=digit/10;
            temp.next=newNode;
            temp=temp.next;
            head2=head2.next;
        }

        if(carry>0){
            ListNode newNode=new ListNode(carry);
            temp.next=newNode;
            temp=temp.next;
        }

        return reverse(dummy.next);
        
    }
}



// 9 8 1
