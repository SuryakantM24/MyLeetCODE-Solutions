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

       
       
        Node temp=head;
        Node head1=null,tail=null;
        HashMap<Node,Node> map=new HashMap<>();

        while(temp!=null){
            Node newNode=new Node(temp.val);
            if(head1==null){
                head1=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }

            map.put(temp,newNode);
            
            temp=temp.next;          

        }

        temp=head;
        tail=head1;
        while(temp!=null){
            Node rnd=map.get(temp.random);
            tail.random=rnd;

            tail=tail.next;
            temp=temp.next;
        }

        return head1;

        

            
       


       
    }
}