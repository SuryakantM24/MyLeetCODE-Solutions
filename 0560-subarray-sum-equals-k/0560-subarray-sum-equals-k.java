class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

        int sum=0;

        map.put(sum,1);
        int res=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            if(map.containsKey(sum-k)){
                res+=map.get(sum-k);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return res;
        
    }
}


