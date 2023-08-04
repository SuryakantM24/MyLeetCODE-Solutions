class Solution {
    public int search(int[] nums, int target) {
        


        int s=0;
        int e=nums.length-1;


        while(s<=e){

            int mid=s+(e-s)/2;

            if(nums[mid]==target){
                return mid;
            }

            else if(nums[mid]>=nums[s]){
                // s to mid sorted

                if(nums[mid]>=target&&target>=nums[s]){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
                
            }
            else{
                // mid to e sorted
                if(nums[mid]<=target&&target<=nums[e]){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
        }

        return -1;
    }

}




 
