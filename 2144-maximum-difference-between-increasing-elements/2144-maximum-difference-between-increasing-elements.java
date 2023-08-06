class Solution {
    public int maximumDifference(int[] nums) {

        int min=nums[0];
        int diff=-1;
        for(int i=1;i<nums.length;i++){
            diff=Math.max(diff,nums[i]-min);

            if(min>nums[i]){
                min=nums[i];
            }

        }
         //nums[i] < nums[j].
         return diff==0?-1:diff;
        
    }
}



