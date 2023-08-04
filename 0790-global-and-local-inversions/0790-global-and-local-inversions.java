class Solution {

    public int merge(int[]nums,int l,int m,int r){
        int[] res=new int[r-l+1];
        int count=0;
        int i=l,j=m+1,k=0;
        while(i<=m&&j<=r){
            if(nums[i]<=nums[j]){
                res[k++]=nums[i++];
            }
            else{
                res[k++]=nums[j++];
                count+=m-i+1;

            }
        }
        while(i<=m){
            res[k++]=nums[i++];
        }
        while(j<=r){
            res[k++]=nums[j++];
        }
        for(int z=0;z<r-l+1;z++)
        {
            nums[z+l]=res[z];
        }

        return count;
    }

    public int  findGlobal(int[] nums,int s,int e){

        if(s==e){
            return 0;
        }

        int mid=s+(e-s)/2;
        int x=findGlobal(nums,s,mid);
        int y=findGlobal(nums,mid+1,e);
        int z=merge(nums,s,mid,e);

        return x+y+z;
    }
    public boolean isIdealPermutation(int[] nums) {

        int local=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                local++;
            }
        }
        System.out.println(local);
        int global=findGlobal(nums,0,nums.length-1);
         System.out.println(global);


        return global==local?true:false;

        
    }
}
