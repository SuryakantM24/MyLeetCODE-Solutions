class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int csum=nums[0];
        int osum=nums[0];
        int csummin=nums[0];
        int osummin=nums[0];
        int total=nums[0];

        for(int  i=1;i<nums.length;i++){
            total+=nums[i];
            if(csum>=0){
                csum+=nums[i];
            }
            else{
                csum=nums[i];
            }
            if(csummin>0){
                csummin=nums[i];
            }
            else{
                csummin+=nums[i];
            }

            if(osum<csum){
                osum=csum;
            }
            if(csummin<osummin){
                osummin=csummin;
            }

        }


        return osum>0?Math.max(osum,total-osummin):osum;
        
    }
}