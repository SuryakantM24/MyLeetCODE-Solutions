class Solution {
    public boolean check(int[] nums) {

        if(nums.length==1){
            return true;
        }
        int l=nums.length;
        int count=1;

        for(int i=1;i<2*l;i++){

            if(nums[i%l]>=nums[(i-1)%l]){
                count++;
            }
            else{
                count=1;
            }
            if(count==l){
                return true;
            }
        }
        return false;

    }
}