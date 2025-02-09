class Solution {
    public int majorityElement(int[] nums) {
        
         int count=1;
        int major=nums[0];
        for(int i=1;i<nums.length;i++){
            if (nums[i] == major) {
                count++;
            }
            else{
                count--;
                if(count==0){
                    major=nums[i];
                    count=1;
                }
            }
        }
        int num=0;
        for(int i=0;i<nums.length;i++){ if(nums[i]==major) num++;
        }
        if(num>nums.length/2) return major;
        else return -1;
    }
}