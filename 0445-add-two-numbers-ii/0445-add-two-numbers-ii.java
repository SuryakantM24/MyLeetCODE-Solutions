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

        ListNode curr=head,nextt=head,prev=null;
        while(curr!=null){
            nextt=nextt.next;
            curr.next=prev;
            prev=curr;
            curr=nextt;
        }

        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode h1=reverse(l1);
        ListNode h2=reverse(l2);
        int carry=0;
        ListNode head=null,tail=null;

        while(h1!=null||h2!=null){
            int digit=carry;
            if(h1!=null){
                digit+=h1.val;
                h1=h1.next;
            }
            if(h2!=null){
                digit+=h2.val;
                h2=h2.next;   
            }
            carry=digit/10;
            ListNode temp=new ListNode(digit%10);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=tail.next;
            }
            // if(h1!=null){
            //     h1=h1.next;
            // }
            // if(h2!=null){
            //     h2=h2.next;
            //  }
          
        }
        if(carry>0){
                ListNode temp=new ListNode(carry);
                tail.next=temp;
                tail=tail.next;
        }
        return reverse(head);   
    }
}





 