class Solution {


    public String longest(String str1,String str2){
        String res="";
        int i=0;
        int j=0;
        while(i<str1.length()&&j<str2.length()){
            if(str1.charAt(i)==str2.charAt(j)){
                res+=str1.charAt(i);
                
            }
            else{
                break;
            }
            i++;
            j++;

            
        }
        return res;
    }
    public String longestCommonPrefix(String[] strs) {

        if(strs.length==1){
            return strs[0];
        }

        String res=longest(strs[0],strs[1]);
        for(int i=2;i<strs.length;i++){
            res=longest(strs[i],res);
        }

        return res;
        
    }
}