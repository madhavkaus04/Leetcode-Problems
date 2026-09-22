class Solution {
    public String multiply(String num1, String num2) {
       if (num1.equals("0") || num2.equals("0"))
            return "0";
        int[] result = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';
                int p = i + j + 1;
                int sum = a * b + result[p];
                result[p] = sum % 10;
                result[p - 1] += sum / 10;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int x : result) {
            if (ans.length() > 0 || x != 0)
                ans.append(x);
        }
        return ans.toString();
    }
}