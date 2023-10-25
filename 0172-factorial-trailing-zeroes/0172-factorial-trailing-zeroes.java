class Solution {
    public int trailingZeroes(int n) {
        

    
        int count=0;
        int temp=5;
        while(n/temp>0){
            count+=n/temp;
            
            temp=temp*5;
        }

        return count;
    }
}