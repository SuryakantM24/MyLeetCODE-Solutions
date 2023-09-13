class Solution {
    public int longestConsecutive(int[] nums) {

       if(nums.length==0){
           return 0;
       }
       HashSet<Integer> set=new HashSet<>();

       for(int a:nums){
           set.add(a);
       }
     
       int res=Integer.MIN_VALUE;
       for(int a:nums){
           if(!set.contains(a-1)){
                 int s=0;
                 while(set.contains(a)){
                      s++;
                      a++;
                 }
                 if(s>res){
                     res=s;
                 }
           }
       }

       return res;
        
    }
}