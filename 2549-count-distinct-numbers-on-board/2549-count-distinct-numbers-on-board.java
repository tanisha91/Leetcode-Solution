class Solution {
    public int distinctIntegers(int n) {
       /* int count=0;
       // int i=2;
        while(n>0){
            for(int i=2;i<n;i++){
            if(n%i==1){
                count++;
            }
        }
            n--;
        }*/
        return Math.max(n-1,1);
    }
}