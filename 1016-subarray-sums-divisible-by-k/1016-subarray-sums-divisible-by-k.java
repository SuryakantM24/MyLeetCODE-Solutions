class Solution {
    public int subarraysDivByK(int[] nums, int k) {
           
           HashMap<Integer,Integer> map=new HashMap<>();
           map.put(0,1);
           int count=0;
           int Sum=0;
           for(int i=0;i<nums.length;i++){
               Sum+=nums[i];
               int rem=((Sum%k)+k)%k;
              
               if(map.containsKey(rem)){
                   count+=map.get(rem);
               }
               map.put(rem,map.getOrDefault(rem,0)+1);
           }

           return count;
    }
}










