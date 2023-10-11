class Solution {

  
    public int addDigits(int num) {
        

        if(num<10){
            return num;
        }

        int res=num%10+addDigits(num/10);

        return addDigits(res);

   
    }
}