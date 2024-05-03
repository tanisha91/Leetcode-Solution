class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         HashSet<List<Integer>> hs=new HashSet<>();
        Arrays.sort(nums);
        List<Integer> ls=new ArrayList<>();
        List<List<Integer>> al=new ArrayList<>();
        // Arrays.sort(candidates);
        rec(nums,0,ls,al,hs);
        return al;
    }
    
    void rec(int nums[],int idx,List<Integer> ls,List<List<Integer>> ans,HashSet<List<Integer>> hs){
        if(idx==nums.length){
            if(!hs.contains(ls)){
                hs.add(ls);
            
            ans.add(new ArrayList<>(ls));
            }
            return ;
        }
        
        // if(idx>nums.length) return;
        // else{
        ls.add(nums[idx]);
        rec(nums,idx+1,ls,ans,hs);
        ls.remove(ls.size()-1);
        rec(nums,idx+1,ls,ans,hs);
  // /  }
    }
}