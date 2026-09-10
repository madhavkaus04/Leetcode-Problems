class Solution {
    public int numberOfSubstrings(String s) {
        int ans = 0;
        int[] p={-1,-1,-1};
        for(int i =0;i < s.length();i++){
            p[(s.charAt(i) & 31) - 1] =i;
            ans += Math.min(p[0], Math.min(p[1],p[2])) +1;
        }
        return ans;
    }
}