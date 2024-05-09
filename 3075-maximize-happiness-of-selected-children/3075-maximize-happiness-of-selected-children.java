class Solution {
    public long maximumHappinessSum(int[] h, int k) {
        Arrays.sort(h);
       long sum=0;
        int n=h.length-1;
        int c=0;
        while(n>=0 && k>0){
            if(h[n]-c>0)
                sum+=h[n]-c;
            else{
                break;
                }
            n--;
            k--;
            c++;
            }
        return sum;
                      
            
    }
}