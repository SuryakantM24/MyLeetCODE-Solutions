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
        if(head==null||head.next==null){
            return head;
        }

        ListNode curr=head,next=head,prev=null;
        while(curr!=null){
            next=next.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1=reverse(l1);
        ListNode temp2=reverse(l2);

        int carry=0;
        ListNode head=null,tail=null;
        while(temp1!=null||temp2!=null){

            int digit=carry;

            if(temp1!=null){
                digit+=temp1.val;
                temp1=temp1.next;
            }
            if(temp2!=null){
                digit+=temp2.val;
                temp2=temp2.next;
            }

            ListNode neww=new ListNode(digit%10);
            carry=digit/10;

            if(head==null){
                head=neww;
                tail=neww;
            }
            else{
                tail.next=neww;
                tail=tail.next;
            }
        }

        if(carry>0){
             ListNode neww=new ListNode(carry);
             tail.next=neww;
             tail=tail.next;

        }


        return reverse(head);
        
    }
}