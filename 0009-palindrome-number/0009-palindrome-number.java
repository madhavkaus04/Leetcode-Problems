class Solution {
    public boolean isPalindrome(int x) {
     int a=x;
     int num=0;
     while(x>0){
     int digit =x%10;
     num=num*10+digit;
     x=x/10;
     }
     return a==num;

     }   
    
}