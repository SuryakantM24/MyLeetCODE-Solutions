class LRUCache {

    class Node {
        int val;
        int key;
        Node prev;
        Node next;
        Node (int key,int val){
            this.key=key;
            this.val=val;
            this.prev=null;
            this.next=null;
        }

    }
    int capacity;
    HashMap<Integer,Node> map=new HashMap<Integer,Node>();
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);

    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    private void addNode(Node adNode){
        Node temp=head.next;
        adNode.next=temp;
        head.next=adNode;
        temp.prev=adNode;
        adNode.prev=head;
    }
    private void delNode(Node dNode){
        Node nex=dNode.next;
        Node pre=dNode.prev;

        pre.next=nex;
        nex.prev=pre;

    }
    public int get(int key) {
        if(map.containsKey(key)){
            Node res=map.get(key);
            int ans=res.val;
            delNode(res);
            addNode(res);
            map.put(key,head.next);
            return ans;
        }
        return -1;

    }
    
    public void put(int key, int value) {

        if(map.containsKey(key)){
            Node res=map.get(key);
            map.remove(key);
            delNode(res);
        }
        if(capacity==map.size()){
            Node rem=map.get(tail.prev.key);
            map.remove(tail.prev.key);
            delNode(rem);
        }
        addNode(new Node(key,value));
        map.put(key,head.next);
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
