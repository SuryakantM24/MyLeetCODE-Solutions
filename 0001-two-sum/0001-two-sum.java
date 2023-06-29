class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Array of size 2 for storing indexes
        int arr[]=new int[2];

        // Hashmap to store numbers and there indexes
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
        // if a+b=sum then sum-a=b;
        // so if i get sum-b present in map then i can say a and b is pair of with  given sum
            if(map.containsKey(complement)){
                // if map contains a and is complement then its a pair and we return it
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);// put the number if not present for future use 
        }
        // return empty array.
        return arr;
        



        
    }
}