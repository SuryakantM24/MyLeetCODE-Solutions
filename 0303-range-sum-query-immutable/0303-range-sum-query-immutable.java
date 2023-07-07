class NumArray {

    int arr[];

    public NumArray(int[] nums) {
        arr=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i]=nums[i]+arr[i-1];
        }
        
    }
    
    public int sumRange(int left, int right) {


        return left>0?arr[right]-arr[left-1]:arr[right]-0;

        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */


//   0  1 2  3  4  5
//  -2  0 3 -5  2 -1
//  -2.-2 1 -4 -2 -3
  
