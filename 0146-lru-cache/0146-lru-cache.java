class LRUCache {
    class Node{
        Node next;
        Node prev;
        int val;
        int key;

        Node( int key,int val){
            this.val=val;
            this.key=key;
            this.prev=null;
            this.next=null;
        }
    
    }
    int cap;
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);
    HashMap<Integer,Node> map=new HashMap<Integer,Node>();

    public LRUCache(int capacity) {
       this.cap=capacity;
       head.next=tail;
       tail.prev=head; 
    }

    private  void addNode (Node newNode){
        //add start
        Node temp=head.next;
        newNode.next=temp;
        newNode.prev=head;
        head.next=newNode;
        temp.prev=newNode;

    }
    public void deleteNode(Node delNode){
        //delete node  -1 head -1 tail solves issue and we always remove from like given postiion
        Node pre=delNode.prev;
        Node nex=delNode.next;
        pre.next=nex;
        nex.prev=pre;
    }   
    public int get(int key) {

        if(map.containsKey(key)){
            Node res=map.get(key);
            int out=res.val;
            map.remove(key);
            deleteNode(res);
            addNode(res);
            map.put(key,head.next);
            return out;
        }
        return -1;   
    }
    
    public void put(int key, int value) {
        
        if(map.containsKey(key)){
           Node res=map.get(key);
           map.remove(key);
           deleteNode(res);

        }
        if(cap==map.size()){
            map.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        Node newNode=new Node(key,value);
        addNode(newNode);
        map.put(key,head.next);
        

        }

    }


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */













    
    