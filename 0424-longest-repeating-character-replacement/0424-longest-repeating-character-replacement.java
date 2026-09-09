class Solution {
    public int characterReplacement(String s, int k) {
     int[] freq = new int[26];
     int left = 0;
     int maxFreq = 0;
     int answer = 0;
     for(int i=0;i<s.length();i++){
        int index = s.charAt(i)-'A';
        freq[index]++;
        maxFreq = Math.max(maxFreq, freq[index]);
        while((i - left +1) - maxFreq > k){
            freq[s.charAt(left) - 'A']--;
            left++;
        }
        answer = Math.max(answer, i - left+1);
     }   
     return answer;
    }
}