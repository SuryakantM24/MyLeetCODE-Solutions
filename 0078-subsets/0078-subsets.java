class Solution {
    public List<List<Integer>> subsets(int[] nums) {


        int k=nums.length;
        int total=(int)Math.pow(2,k);


        List<List<Integer>> ans=new ArrayList<List<Integer>>();
         //total number of subsets, as each elements has two choices weather to take   of not. hence k numbers will have 2^k choices.

        for(int i=0;i<total;i++){


            List<Integer> arr=new ArrayList<Integer>();
            int temp=i;
            // here  temp is subset number
            for(int j=0;j<nums.length;j++){
                // now we check using bit manipulation for given subset number(temp) which nums[j] are in
                int rem=temp%2;
                temp=temp/2;
                if(rem==1){
                    arr.add(nums[j]);
                }
            }

            ans.add(arr);
        


        }
        return ans;
        
        
    }
}