class MyHashMap {

    class Node {
        int key;
        int val;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            next = null;
        }
    }

    private Node head;
    private Node tail;

    public MyHashMap() {
        head = new Node(-1, -1); // Create a dummy head node
        tail=head;
    }

    public void put(int key, int value) {
        Node newNode = new Node(key, value);
        Node prev = findPrev(key);

        if (prev.next == null) {
            prev.next = newNode; // Insert at the end of the list
        } else {
            prev.next.val = value; // Update the value if key already exists
        }
    }

    public int get(int key) {
        Node prev = findPrev(key);
        if (prev.next != null) {
            return prev.next.val;
        }
        return -1;
    }

    public void remove(int key) {
        Node prev = findPrev(key);
        if (prev.next != null) {
            prev.next = prev.next.next; // Remove the node
        }
    }

    private Node findPrev(int key) {
        Node current = head;
        while (current.next != null && current.next.key != key) {
            current = current.next;
        }
        return current;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */