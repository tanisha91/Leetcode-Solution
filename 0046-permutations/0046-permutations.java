class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> x=new ArrayList<>();
       rec(nums,x,0);
        return x;
    }
  void rec(int[] nums, List<List<Integer>>ans,int idx){
        
        if(idx==nums.length){
             List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            ans.add( permutation );
            return ;
        }
        for(int j=idx;j<nums.length;j++){
            swap(nums,idx,j);
            rec(nums,ans,idx+1);
            swap(nums,idx,j);
        }
         // return ans;
    }
    void swap(int []nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
       nums[b]=temp;
    }
}