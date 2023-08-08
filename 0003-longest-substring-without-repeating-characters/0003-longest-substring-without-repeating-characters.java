class Solution {
    public int lengthOfLongestSubstring(String s) {

     
        int i=0,j=0,max=0;
        HashSet<Character> q = new HashSet<>();
        while(j<s.length()){
            if(q.contains(s.charAt(j)))
                q.remove(s.charAt(i++));
            if(!q.contains(s.charAt(j))){
                q.add(s.charAt(j));
                max=Math.max(j-i+1,max);
                j++;
            }
        }
        return max;
    }
}
 
// 0 1 2 3 4 5 6 7
// a b c a b c b b

// i 
// j

