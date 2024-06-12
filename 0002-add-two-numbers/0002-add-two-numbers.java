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
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(l1!=null||l2!=null){
             int digit = carry;
             if(l1!=null){
                digit+=l1.val;
                l1=l1.next;
             }
             if(l2!=null){
                digit+=l2.val;
                l2=l2.next;
             }
             ListNode newNode=new ListNode(digit%10);
             temp.next=newNode;
             temp=temp.next;
             carry=digit/10;
             
        }
        if(carry>0){
            ListNode newNode=new ListNode(carry);
            temp.next=newNode;

        }
        return dummy.next;
        
    }
}