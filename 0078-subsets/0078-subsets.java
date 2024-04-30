class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ans1=new ArrayList<>();
    sub(nums,0,ans1,ans);
        return ans;
    }
   void sub(int nums[],int idx,List<Integer> ls,List<List<Integer>> res)
    {
        // if(idx>=nums.length){
        //     res.add(ls);
        //     return ;
        // }
        res.add(new ArrayList<>(ls));
       for(int j=idx;j<nums.length;j++){
           ls.add(nums[j]);
         sub(nums,j+1,ls,res);
       ls.remove(ls.size()-1);
       }
        // return ans;
    }
}