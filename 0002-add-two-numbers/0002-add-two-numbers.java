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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry=0;
        ListNode head=null,tail=null;

        while(l1!=null||l2!=null){
            int digit=carry;

            if(l1!=null){
                digit+=l1.val;
            }
            if(l2!=null){
                digit+=l2.val;
            }

            carry=digit/10;
            ListNode newNode=new ListNode(digit%10);

            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=tail.next;
            }
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }

        }

        if(carry>0){
            ListNode n=new ListNode(carry);
            tail.next=n;
            tail=tail.next;
        }

        return head;
        
        
        
    }
}
     