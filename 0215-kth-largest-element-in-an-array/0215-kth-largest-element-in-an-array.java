class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq=new PriorityQueue<>(k);
         
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }

        for(int i=k;i<nums.length;i++){

            pq.add(Math.max(nums[i],pq.poll()));
        }

        return pq.poll();
        
    }
}

