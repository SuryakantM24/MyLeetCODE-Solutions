class Solution {

   
    public int[] xorQueries(int[] arr, int[][] queries) {

        int [] ans=new int[queries.length];

        int [] preXor=new int[arr.length];

        preXor[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            preXor[i]=arr[i]^preXor[i-1];
        }

        for(int i=0;i<queries.length;i++){
            int s=queries[i][0];
            int e=queries[i][1];
            ans[i]=(s==0?preXor[e]:preXor[e]^preXor[s-1]);
        }

        return ans;


        
    }
}

// 0            1             2             3

// 1            3             4             8

// 1          1^3           1^3^4       1^3^4^8


