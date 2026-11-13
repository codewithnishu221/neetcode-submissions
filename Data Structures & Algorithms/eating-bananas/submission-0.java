class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int low =1; int high = arrMax(piles);
        int ans = high;
        while(low <= high){
            int mid = low + (high - low)/2;
            long totalHours = getTotalHours(piles, mid);
            if(totalHours <= h){
                ans = mid;
             high = mid -1;
            } else{
                low = mid +1;
            }
        }
        return ans;
    }
    static long getTotalHours(int[] piles, int hourly){
        long totalHours = 0;
        for(int pile: piles){
            totalHours += (long) (pile + hourly -1) / hourly;
        }
        return totalHours;
    }
     static int arrMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i: arr){
            max = Math.max(max, i);
        }
        return max;
     }
    
}
