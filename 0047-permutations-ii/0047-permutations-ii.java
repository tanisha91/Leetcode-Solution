class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        per(nums,ans,0);
        return ans;
    }
    void per(int []nums,List<List<Integer>> ans,int idx){
        if(idx==nums.length){
            List<Integer> ls=new ArrayList<>();
            for(int c:nums){
                ls.add(c);
            }
            ans.add(ls);
        }
        HashSet<Integer> hs=new HashSet<>();
        
        for(int j=idx;j<nums.length;j++){
            if(hs.contains(nums[j])) continue;
            hs.add(nums[j]);
            swap(nums,idx,j);
            per(nums,ans,idx+1);
            swap(nums,idx,j);
        }
    }
    void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}