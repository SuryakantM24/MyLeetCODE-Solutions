class Solution {

    private String[] map={"?","!!","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinationsHelp(String digits) {

           if(digits.length()==0){
               List<String> s= new ArrayList<String>();
               s.add("");
               return s;
           }

           List<String> small=letterCombinationsHelp(digits.substring(1));
           String ex=map[digits.charAt(0)-'0'];
           List<String> f=new ArrayList<String>();
           for(int i=0;i<ex.length();i++){
               char c=ex.charAt(i);
               for(String st: small){
                   f.add(c+st);
               }
           }

           return f;
           
        
    }
    public List<String> letterCombinations(String digits) {

        if(digits.length()==0){
               List<String> s= new ArrayList<String>();
              
               return s;
        }
        
        return letterCombinationsHelp(digits);
    }
}