class Solution {
    public boolean checkGoodInteger(int n) {
    int sum = 0;
    while(n > 0){
        int digit = n % 10;
        sum += digit * (digit - 1);
        n /= 10;
    }    
    return sum >= 50;
    }
}