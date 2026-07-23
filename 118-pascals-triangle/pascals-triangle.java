class Solution {
    public int nCr(int n, int r){
        long res = 1;
        for(int i=0; i<r; i++){
            res = res * (n-i);
            res = res / (i+1);
        }
        return (int)res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<numRows;i++){
            List<Integer>temp = new ArrayList<>();
            for(int j=0; j<= i; j++){
                temp.add(nCr(i,j));
            }
            ans.add(temp);
        }
        return ans;
    }
}