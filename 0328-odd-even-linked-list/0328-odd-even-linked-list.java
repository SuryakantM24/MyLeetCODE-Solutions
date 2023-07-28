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
    public ListNode oddEvenList(ListNode head) {
         
         if(head==null||head.next==null){
             return head;
         }
         ListNode oH=head,oT=head;
         ListNode eH=head.next,eT=head.next;
         while(oT.next!=null&&eT.next!=null){
           if(eT.next!=null){
             oT.next=eT.next;
             oT=oT.next;
           }
           if(oT.next!=null){
             eT.next=oT.next;
             eT=eT.next;
           }

         }

         if(eT.next!=null){
             eT.next=null;
         }
         if(oT.next!=null){
             oT.next=null;
         }
        //  while(oH!=null){
        //      System.out.print(oH.val+" ");
        //      oH=oH.next;
        //  }
        //  while(eH!=null){
        //      System.out.print(eH.val+" ");
        //      eH=eH.next;
        //  }

         oT.next=eH;

         return oH;



        

         


        
    }
}

