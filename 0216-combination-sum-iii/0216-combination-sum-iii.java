class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> comb=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        rec(comb,ans,k,n,1);
        return comb;
    }
    void rec(List<List<Integer>> comb,List<Integer>ls,int k,int n,int idx)
    {
        if(k==0){
            if(n==0){
                comb.add(new ArrayList<>(ls));
                
            }
            return ;
        }
        for(int i=idx;i<10;i++){
            ls.add(i);
            rec(comb,ls,k-1,n-i,i+1);
            ls.remove(ls.size()-1);
        }
    }
}