class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length; // rows
        int n = matrix[0].length; // columns
        int col0 = 1;

        // chk for zero and mark row 0 and col 0
        for(int i=0; i<m; i++){
            if(matrix[i][0] == 0){
                col0 = 0;
            }
            for(int j=1; j<n; j++){ // Starts from 1 as col0 is used
                if(matrix [i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        // Traverse remaining arr
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix [i][j] != 0){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        // Handle first row
        if(matrix[0][0] == 0){
            for(int j=0; j<n; j++){
                matrix[0][j] = 0;
            }
        }

        // Handle first col
        if(col0 == 0){
            for(int i=0; i<m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}