class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int low = 0, high = 0;
        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            int d = 1, sum = 0;
            for (int w : weights) {
                if (sum + w > mid) {
                    d++;
                    sum = 0;
                }
                sum += w;
            }
            if (d <= days)
                high = mid;
            else
                low = mid + 1;
        }
        return low;  
    }
}