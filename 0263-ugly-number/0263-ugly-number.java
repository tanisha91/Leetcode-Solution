class Solution {
    public boolean isUgly(int n) {
       if(n<=0) return false;
        if(n==1) return true;
        while(n%2==0) return isUgly(n/2);
         while (n%3==0) return isUgly(n/3);
          while(n%5==0) return isUgly(n/5);
           return false;
            }
        }
  