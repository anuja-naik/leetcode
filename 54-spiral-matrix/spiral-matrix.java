class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length; 
        int n = matrix[0].length;
        List<Integer>ans = new ArrayList<>();
        int startRow = 0;
        int endRow = m-1;
        int startCol = 0;
        int endCol = n-1;
        
        while(startRow <= endRow && startCol <= endCol){
            // top 
            for(int j=startCol; j<=endCol; j++){
                ans.add(matrix[startRow][j]); 
            }
            startRow ++;

            // right 
            for(int i=startRow; i<=endRow; i++){
                ans.add(matrix[i][endCol]);
            }
            endCol --;

            // bottom
            if(startRow <= endRow){
                for(int j= endCol; j>= startCol; j--){
                    ans.add(matrix[endRow][j]);
                }
            }
            endRow --;

            // left
            if(startCol <= endCol){
                for(int i=endRow; i>=startRow; i--){
                    ans.add(matrix[i][startCol]);
                }
            }
            startCol ++;
        }
        return ans;
    }
}