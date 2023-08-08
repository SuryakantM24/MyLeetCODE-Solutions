class Solution {

    public int search(int[] nums, int target) {

        int s=0;
        int e=nums.length-1;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(nums[mid]==target){
                return mid;
            }

            else if (nums[s]<=nums[mid]){
                // s to mid is sorted
                if(nums[mid]>=target&&nums[s]<=target){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            else if(nums[mid]<=nums[e]){
                //mid to e is sorted
                if(nums[e]>=target&&nums[mid]<=target){
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