class Solution {
    public int reverse(int x) {
        
        long num=x;
        long res=0;
        
        
        while(num!=0){
            long rem=num%10;

            res=res*10+rem;
            num=num/10;
        }

        if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE){
            return 0;
        }

        return (int)res;
        

        
    }
}