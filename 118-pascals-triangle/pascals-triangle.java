class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int row=0; row<numRows; row++){
            List<Integer> temp = new ArrayList<>();
            int val = 1;
            for(int col =0; col <= row; col ++){
                temp.add(val);
                val = val * (row - col);
                val = val / (col+1);
            }
            list.add(temp);
        }
        return list;
    }
}