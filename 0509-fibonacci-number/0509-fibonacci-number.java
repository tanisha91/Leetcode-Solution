class Solution {
    public int fib(int n) {
        int ans=0;
        ans=fibo(n);
        return ans;
        
    }
     int sum=0;
    int fibo(int n){
        if(n==0)return 0;
       if(n==1 ||n==2) return 1;
        return fibo(n-2)+fibo(n-1);
    }
}