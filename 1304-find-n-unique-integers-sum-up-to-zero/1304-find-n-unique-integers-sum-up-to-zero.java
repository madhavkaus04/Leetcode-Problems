class Solution {
    public int[] sumZero(int n) {
    int a = n/2;
    int arr[] = new int[n];
    int b = 0-a;
    for(int i=0; i<n; i++){
        if(n%2 == 0 && b==0){
            b++;
        }
        arr[i]=b;
        b++;
    }    
    return arr;
    }
}