class Solution {
    public int singleNumber(int[] nums) {
        int unoque=0;
        for(int i=0;i<nums.length;i++){
            unoque^=nums[i];
        }
        return unoque;
    }
}