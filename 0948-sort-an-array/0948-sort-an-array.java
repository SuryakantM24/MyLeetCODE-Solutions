class Solution {

    public void merge(int[]nums,int l,int m,int r){
        int[] res=new int[r-l+1];
        int i=l,j=m+1,k=0;
        while(i<=m&&j<=r){
            if(nums[i]<nums[j]){
                res[k++]=nums[i++];
            }
            else{
                res[k++]=nums[j++];
            }
        }
        while(i<=m){
            res[k++]=nums[i++];
        }
        while(j<=r){
            res[k++]=nums[j++];
        }
        for(int a=0,b=l;a<res.length;a++,b++)
        {
            nums[b]=res[a];
        }
    }
    public void mergeSort(int[] nums,int l,int r){
        if(l>=r){
            return;
        }
        int m=l+(r-l)/2;
        mergeSort(nums,l,m);
        mergeSort(nums,m+1,r);
        merge(nums,l,m,r);
    }
    public int[] sortArray(int[] nums) {

        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}