class MinStack {


   Stack<Integer> st;
   Stack<Integer> min;


   
    public MinStack() {
        st=new Stack<Integer>();
        min=new Stack<Integer>();
           
    }
    

    public void push(int val) {

        if(st.isEmpty()){
            st.push(val);
            min.push(val);
        }
        else{
            st.push(val);
            min.push(Math.min(min.peek(),val));
        }

       
    }
    
    public void pop() {

       st.pop();
       min.pop();
    }
    
    public int top() {
       return st.peek();
        
    }
    
    public int getMin() {
      return  min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */