class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
       Arrays.sort(nums);
        if(n<=1)
                return false;
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}