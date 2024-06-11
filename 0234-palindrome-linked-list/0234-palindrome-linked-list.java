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

    public ListNode middle(ListNode head){

        ListNode fast=head,slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;

    }
    public ListNode reverse(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode smallHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return smallHead;
    }
    public boolean isPalindrome(ListNode head) {

        if(head==null||head.next==null){
            return true;
        }
        ListNode temp=middle(head);
        ListNode head2=reverse(temp.next);
        temp.next=null;
        while(head2!=null){
            if(head.val!=head2.val){
                return false;
            }
            head=head.next;
            head2=head2.next;
        }
        return true;

        
    }
}

