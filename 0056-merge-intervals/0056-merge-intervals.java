class Solution {

    // Mycmp implements Comparator<Integer>{

    //     public int compare(int a[],int b[]){
    //         int val1=a[0];
    //         int val2=b[0];
            
    //         return val1-val2;
    //     }
    // }
    public int[][] merge(int[][] intervals) {
 
        Arrays.sort(intervals,(a,b)->{
                int val1=a[0];
            int val2=b[0];
            
            return val1-val2;
        });
        Stack<int []> st=new Stack<>();
        st.push(intervals[0]);
        
        for(int i=1;i<intervals.length;i++){

            int [] arr=intervals[i];
            int [] top=st.peek();
            if(top[1]<arr[0]){
                st.push(arr);
            }
            else if(top[1]>=arr[0]){

                int [] temp=st.pop();
                temp[1]=Math.max(top[1],arr[1]);
                st.push(temp);
            }
            
        }
        
        int res[][]=new int[st.size()][2];
        int i=res.length-1;
        while(!st.isEmpty()){
            res[i--]=st.pop();
  
        }

        return res;
        

    }
}







