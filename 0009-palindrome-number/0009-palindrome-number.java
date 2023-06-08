class Solution {
    public boolean isPalindrome(int x) {
          int sum=0;
         int n=x;
        if(x<0) return false;
        else{
          
           
            while(x>0){
                int rem=x%10;
                sum =sum*10+rem;
                x/=10;
            }
        }
        if(sum==n) return true;
        return false;
    }
}