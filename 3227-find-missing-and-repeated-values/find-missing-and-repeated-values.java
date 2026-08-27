class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] row : grid){
            for(int num: row){
                map.put(num, map.getOrDefault(num, 0)+1);
            }
        }
        int rpt = -1;
        for(Map.Entry<Integer, Integer> set : map.entrySet()){
            int freq = set.getValue();
            if(freq > 1){
                rpt = set.getKey();
            }
        }

        int missing = -1;
        int n = grid.length;
        for(int i=1; i<= n*n; i++){                  // pb says nos are from 1-n^2 (n*n)
            if(! map.containsKey(i)){
                missing = i;
                break;
            }
        }
        return new int[] {rpt, missing};
    }
}