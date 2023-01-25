class Solution {
    public boolean containsDuplicate(int[] nums) {
       
        Arrays.sort(nums);
        int n= nums.length;
        if(n<=1){
            return false;
        }
        for( int i=0;i<n-1;i++){
            
                if(nums[i]==nums[i+1]){
                    return true;
                }
            
        }
     
        return false;
       
    }
}