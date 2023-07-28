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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

         if(list1==null){
            return list2;

         }
         if(list2==null){
             return list1;
         }
        

            ListNode head=null;
            ListNode tail=null;

            if(list1.val<list2.val){
                head=list1;
                tail=list1;
                list1=list1.next;
            
            }
            else{
                head=list2;
                tail=list2;
                list2=list2.next;
            }

            while(list1!=null&&list2!=null){
                if(list1.val<list2.val){
                    tail.next=list1;
                    list1=list1.next;
                }
                else{
                    tail.next=list2;
                    list2=list2.next;

                }
                tail=tail.next;
            }

            if(list1!=null){
                tail.next=list1;
            }
            if(list2!=null){
                tail.next=list2;
            }


        return head;

        
    }
    public ListNode middleNode(ListNode head) {
          ListNode slow=head;
          ListNode fast=head;

          while(fast.next!=null&&fast.next.next!=null){
              fast=fast.next.next;
              slow=slow.next;
          }
          return slow;    
    }
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode head2=middleNode(head);
        ListNode head3=head2.next;
        head2.next=null;

        ListNode ans1=sortList(head);
        ListNode ans2=sortList(head3);
        ListNode res= mergeTwoLists(ans1,ans2);

        return res;
           
    }
}