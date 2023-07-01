class Solution {


    
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[strs.length-1];
        String ans="";
        int i=0,j=0;
        while(i<str1.length()&&j<str2.length()){
            if(str1.charAt(i)==str2.charAt(j)){
                ans+=str1.charAt(i);
            }
            else{
                break;
            }
            i++;
            j++;

        }
        return ans;
    }
}