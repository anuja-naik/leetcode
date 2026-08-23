class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int i=0; i<weights.length; i++){
            low = Math.max(low, weights[i]);          // max val of weights is set minCapacity
            high += weights[i];                       // Sum of all weights is maxCapacity of ship
        }

        while(low < high){
            int mid = low + (high - low)/2;
            // track days and load
            int day = 1;
            int load = 0;
            for(int weight : weights){
                // Capacity exceeded so go to next day and load ur weight there
                if(load + weight > mid){
                    day = day + 1;
                    load = weight;
                }
                // Capacity not exceeded so load in same day
                else{
                    load += weight;
                }
            }
            // Mid capacity works
            if(day <= days){
                high = mid;
            }
            // Mid capacity is less 
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}