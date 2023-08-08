class Solution {
    public int lengthOfLongestSubstring(String s) {

        int [] arr=new int[256];

        int i=0,j=0;
        int ans=0;
        while(j<s.length()){

            
            if(arr[s.charAt(j)]==1){
               arr[s.charAt(i)]--;
               i++;
            }
            if(arr[s.charAt(j)]==0){
                arr[s.charAt(j)]++;
                j++;
                ans=Math.max(j-i,ans);
            }
        }
        return ans;
        
    }
}