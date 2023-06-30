class Solution {
    public String reverseWords(String s) {
         String ans="";
         for(int i=s.length()-1;i>=0;i--){
             if(s.charAt(i)!=' '){
             String curr="";
             while(i>=0&&s.charAt(i)!=' '){
                 curr=s.charAt(i)+curr;
                 i--;
             }
            
             if(ans.equals("")==false){
                 ans+=' ';
             }
             ans+=curr;
             }
         }

         return ans;
    }


}






