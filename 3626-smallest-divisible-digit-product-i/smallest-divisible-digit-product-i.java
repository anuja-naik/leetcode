class Solution {
    public int smallestNumber(int n, int t) {
        int current = n;
        while(true){
            int prod = 1;
            n = current ;
            while(n > 0){
                prod *= n%10;
                n/=10;
            }

            if(prod % t == 0){
                break;
            }
            else current ++;
        }
        return current;
    }
}