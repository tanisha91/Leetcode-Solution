class Solution {
    public long mod=1_000_000_007;
    public int countGoodNumbers(long n) {
        long odd=n/2;
        long even=(n+1)/2;
        
        return (int)(pow(5,even)*pow(4,odd)%mod);
    }
    long pow(long x,long y){
        if(y==0) return 1;
        long ans=pow(x,y/2);
        if(y%2==0){
             return (ans*ans)%mod;
        }
        else{
           return(x*ans*ans)%mod;
        }
        // return ans;
    }
    
}