class Solution {
    public void setZeroes(int[][] matrix) {


        int m=matrix.length;
        int n=matrix[0].length;
        
        int[] row=new int[m];
        int[] col=new int[n];
        Arrays.fill(row,Integer.MAX_VALUE);
        Arrays.fill(col,Integer.MAX_VALUE);
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=0;
                    col[j]=0;
                }
                
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]==0||col[j]==0){
                    matrix[i][j]=0;
                }
            }
        }   
    }
}
    



//        0    1   2   3

// 0.     0    0  2   0

// 1      3.   4.  5.  2


// 2      1.   3   1.  5


// 0,0
// 1,0
// 2,0

// 0,0
// 0,1
// 0,2
// 0,3


