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
    public ListNode partition(ListNode head, int x) {

        if(head==null||head.next==null){
            return head;
        }
        ListNode head1=null,tail1=null;
        ListNode head2=null,tail2=null;
        ListNode temp=head;

        if(temp.val<x){
            head1=temp;
            tail1=temp;
        }
        else{
            head2=temp;
            tail2=temp;
        }
        temp=temp.next;


        while(temp!=null){
            if(temp.val<x){ 
               if(head1==null){
                  head1=temp;
                  tail1=temp;
               }
               else{
                 tail1.next=temp;
                 tail1=tail1.next;
               }
            }
            else{

               if(head2==null){
                  head2=temp;
                  tail2=temp;
               }
               else{
                 tail2.next=temp;
                 tail2=tail2.next;
               }

            }
            temp=temp.next;
        }

        if(head1!=null){
            tail1.next=null;
        }
        else{
            return head2;

        }
        if(head2!=null){
            tail2.next=null;
        }
        else{
            return head1;

        }

        tail1.next=head2;

        return head1;

        
    }
}     
    