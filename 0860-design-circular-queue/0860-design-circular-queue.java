class MyCircularQueue {


    private int[] data;
    private int rear;
    private int front;
    private int size=0;

    public MyCircularQueue(int k) {

        data=new int[k];
        this.rear=-1;
        this.front=-1;
       
        
    }
    
    public boolean enQueue(int value) {
       
       if(size==0){
          front=0;
       }
       if(size==data.length){
           return false;
       }
       rear=(rear+1)%data.length;
       data[rear]=value;
       size++;
       return true;    
    }
    
    public boolean deQueue() {

        if(size==0){
            return false;
        }
        front=(front+1)%data.length;
       
        size--;
        if(size==0){
            rear=-1;
            front=-1;
        }
        return true;
        

        
    }
    
    public int Front() {
        if(size==0){
            return -1;
        }

        return data[front];

    }
    
    public int Rear() {
        if(size==0){
            return -1;
        }

        return data[rear];
        
    }
    
    public boolean isEmpty() {

        return size==0;
        
    }
    
    public boolean isFull() {


        return size==data.length?true:false;
        
     }
        
    


}


/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */