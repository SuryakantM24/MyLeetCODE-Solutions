class NumMatrix {

    int [][] pre;
    public NumMatrix(int[][] matrix) {


        int r=matrix.length;
        int c=matrix[0].length;
        pre=new int[r+1][c+1];

        
       for(int i=1;i<pre.length;i++){
           for(int j=1;j<pre[0].length;j++){
               pre[i][j]=pre[i-1][j]+matrix[i-1][j-1];
           }
       }

       for(int i=1;i<r+1;i++){
           for(int j=1;j<c+1;j++){
               pre[i][j]+=pre[i][j-1];
           }
       }
        
           
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {


        return pre[row2+1][col2+1]-pre[row2+1][col1]-pre[row1][col2+1]+pre[row1][col1];
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */




 