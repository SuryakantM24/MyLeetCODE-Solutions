class Solution {
    public void rotate(int[][] matrix) {
        
    transpose(matrix);
    int row=0;
    while(row<matrix.length){
        int s=0;
        int e=matrix[0].length-1;
        while(s<=e){
            int temp=matrix[row][s];
            matrix[row][s]=matrix[row][e];
            matrix[row][e]=temp;
            s++;
            e--;
        }
        row++;

     }
    }

    public void transpose(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}

