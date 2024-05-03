class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        HashSet<List<Integer>> hs=new HashSet<>();
        List<Integer> ls=new ArrayList<>();
        List<List<Integer>> al=new ArrayList<>();
        Arrays.sort(candidates);
        rec(candidates,0,hs,target,al,ls);
        return al;
    }
    void rec(int[] can,int idx, HashSet<List<Integer>> set,int target,List<List<Integer>> al,List<Integer> ls){
        
        if(target==0){
            //   if(!set.contains(ls)){
            // set.add(ls);
            al.add(new ArrayList<>(ls));
            return ;
        }
        if(target <0 || idx==can.length){
            return ;
        }
      
//             ls.add(can[idx]);
//             rec(can,idx+1,set,target-can[idx],al,ls);
//             ls.remove(ls.size()-1);
//             rec(can,idx+1,set,target,al,ls);
    
    for(int i=idx;i<can.length;i++){
        if(i>idx && can[i]==can[i-1]){
            continue;
        }
        if(can[i]>target) break;
        ls.add(can[i]);
            rec(can,i+1,set,target-can[i],al,ls);
            ls.remove(ls.size()-1);
    }
    }
}