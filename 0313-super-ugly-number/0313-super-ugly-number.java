class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
         int[] dp = new int[n];
        int[] index = new int[primes.length];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            long min = Long.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                long val = (long) dp[index[j]] * primes[j];
                min = Math.min(min, val);
            }
            dp[i] = (int) min;
            for (int j = 0; j < primes.length; j++) {
                if ((long) dp[index[j]] * primes[j] == min) {
                    index[j]++;
                }
            }
        }
        return dp[n - 1];
    }
}