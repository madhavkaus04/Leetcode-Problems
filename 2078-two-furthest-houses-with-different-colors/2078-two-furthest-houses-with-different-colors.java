class Solution {
    public int maxDistance(int[] n) {
        int len = n.length;
        int left = 0, right = 0;
        for (int i = 0; i < len; i++)
            if (n[i] != n[len - 1]) {
                left = i;
                break;
            }
        for (int i = len - 1; i >= 0; i--)
            if (n[i] != n[0]) {
                right = i;
                break;
            }
        return Math.max(len - 1 - left, right);
    }
}