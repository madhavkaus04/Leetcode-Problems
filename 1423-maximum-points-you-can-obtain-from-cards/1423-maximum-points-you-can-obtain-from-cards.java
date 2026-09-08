class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int totalSum=0;
        for(int card:cardPoints) totalSum+=card;
        int windowSize=n-k;
        if(windowSize==0) return totalSum;
        int windowSum=0;
        for(int i=0;i<windowSize;i++) windowSum+=cardPoints[i];
        int minSum=windowSum;
        for(int i=windowSize;i<n;i++){
            windowSum+=cardPoints[i];
            windowSum-=cardPoints[i-windowSize];
            minSum=Math.min(minSum,windowSum);
        }
        return totalSum-minSum;
    }
}