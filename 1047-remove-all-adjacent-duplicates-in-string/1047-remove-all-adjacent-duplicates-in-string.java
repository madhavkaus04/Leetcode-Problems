class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++) {
            char ch =s.charAt(i);
            if(sb.length()>0 && sb.charAt(sb.length()-1)==ch) {
                sb.deleteCharAt(sb.length()-1);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}