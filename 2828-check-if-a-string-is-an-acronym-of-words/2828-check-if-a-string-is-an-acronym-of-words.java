class Solution {
    public boolean isAcronym(List<String> words, String s) {
       return check(words, s, 0);
    }

    public boolean check(List<String> words, String s, int i) {
        if (i == words.size()) {
            return i == s.length();
        }

        if (i >= s.length() || words.get(i).charAt(0) != s.charAt(i)) {
            return false;
        }

        return check(words, s, i + 1);   
    }
}