class Solution {

    public int Kadane(int [] arr){

        int csum=0;
        int osum=0;

        for(int i=0;i<arr.length;i++){

            if(csum>=0){
                csum+=arr[i];
            }
            else{
                csum=arr[i];
            }
            if(csum>osum){
                osum=csum;
            }

        }
        return osum;

    }
    public int KadaneTwo(int [] arr){
        int arr1[]=new int[arr.length*2];
        int k=arr.length;
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
            arr1[i+k]=arr[i];
        }

        return Kadane(arr1);

    }
    public int kConcatenationMaxSum(int[] arr, int k) {
        
        int mod=1000000007;
        if(k==1){
            return Kadane(arr)%mod;
        }
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        if(sum<0){
           return KadaneTwo(arr)%mod;
        }
        else{
           return (int)(KadaneTwo(arr)%mod+((k-2)*sum)%mod)%mod;
        }
    }
}



