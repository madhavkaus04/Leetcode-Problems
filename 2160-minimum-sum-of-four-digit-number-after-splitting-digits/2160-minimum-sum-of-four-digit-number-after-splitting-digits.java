class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        getDigits(num, digits, 0);
        java.util.Arrays.sort(digits);
        return digits[0] * 10 + digits[1] * 10
             + digits[2] + digits[3];
    }
    public void getDigits(int num, int[] digits, int i) {
        if (num == 0) {
            return;
        }
        digits[i] = num % 10;
        getDigits(num / 10, digits, i + 1);
    }
}
