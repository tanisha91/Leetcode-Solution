class Solution {
    public int findPeakElement(int[] nums) {
        int index=0;
        for(int i=1;i<nums.length;i++){
            int max=0;
            if(nums[i-1]<nums[i]){
                max=nums[i];
index=i;
            }
        }
        return index;
    }
}