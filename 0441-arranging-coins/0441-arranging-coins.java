class Solution {
    public int arrangeCoins(int n) {
       int count=0,i=0;
       while(n!=0) {
       i++;
           n=n-i;
           if(n<0){
               break;
           }
           count++;
        }
        return count;
    }    
        }

