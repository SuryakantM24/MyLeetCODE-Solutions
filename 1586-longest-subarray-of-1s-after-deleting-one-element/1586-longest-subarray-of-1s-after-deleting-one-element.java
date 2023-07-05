class Solution {
    public int longestSubarray(int[] nums) {

        int Max=Integer.MIN_VALUE;
        int ones=0;
        for(int i=0;i<nums.length;i++){
            int left=0;
            int right=0;
            if(nums[i]==0){
                for(int j=i-1;j>=0;j--){
                    if(nums[j]==1){
                        left++;
                    }
                    else{
                        break;
                    }
                }

                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==1){
                        right++;
                    }
                    else{
                        break;
                    }
                }
            }

            else if (nums[i]==1){
                  ones++;
            }

            Max=Math.max(Max,left+right);
        }
        
        if(ones==nums.length){
            return nums.length-1;
        }
        return Max;
    }
}



