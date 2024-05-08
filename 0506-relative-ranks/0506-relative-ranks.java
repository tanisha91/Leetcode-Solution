class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String ans[]=new String[n];
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=score[i];
        }
        Arrays.sort(a);
        int s=4;
        HashMap<Integer,String> hs=new HashMap<>();
        hs.put(a[n-1],"Gold Medal");
        if((n-2)>=0){
            hs.put(a[n-2],"Silver Medal");
        }
        if((n-3)>=0){
            hs.put(a[n-3],"Bronze Medal");
        }
        for(int i=n-4;i>=0;i--){
           hs.put( a[i],String.valueOf(s));
            s++;
        }
        
        for(int i=0;i<n;i++){
ans[i]=hs.get(score[i]);
            }
        return ans;
        
    }
}