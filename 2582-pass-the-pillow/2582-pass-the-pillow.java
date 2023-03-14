class Solution {
    public int passThePillow(int n, int time) {
        // int i=0;
        // if(time>n-1){
        //   return time-(n-1);
        // }
        //     // if(time<n-1){
        //     //     return n;
        //     // }
        //     return n;
       return  n - Math.abs(n - 1 - time % (n * 2 - 2));
        }
    }
