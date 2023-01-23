class Solution {
    public boolean isHappy(int n) {
        if(n<7&&n>1) return false;
        if(n==1){
            return true;
        }
         int sum=0;
    while(n>0){
    int rem=n%10;
        sum +=(rem*rem);
        n/=10;
    
}
    return isHappy(sum);
        
    }
    
}