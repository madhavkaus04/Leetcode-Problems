class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int left = 1, right = 0;
        for (int x : piles)
            right = Math.max(right, x);
        while (left < right) {
            int mid = left + (right - left) / 2;
            long hours = 0;
            for (int x : piles)
                hours += (x + mid - 1) / mid;
            if (hours <= h)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
}