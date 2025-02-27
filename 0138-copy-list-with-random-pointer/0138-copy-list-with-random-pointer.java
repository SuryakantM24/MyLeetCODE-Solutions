/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        HashMap<Node,Node> map=new HashMap<Node,Node>();
        Node temp=head;
        while(temp!=null){
            map.put(temp,new Node(temp.val));
            temp=temp.next;
        }
        Node curr=head;
        while(curr!=null){
            Node clone=map.get(curr);
            clone.next=map.get(curr.next);
            clone.random=map.get(curr.random);
            curr=curr.next;
        }
        return map.get(head);
        
    }
}
