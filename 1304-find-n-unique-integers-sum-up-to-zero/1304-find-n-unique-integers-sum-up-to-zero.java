class Solution {
    public int[] sumZero(int n) {
        int []a=new int[n];
        for(int i=1;i<n;i+=2){
            a[i-1]=i;
            a[i]=-i;
        }
        return a;
    }
}