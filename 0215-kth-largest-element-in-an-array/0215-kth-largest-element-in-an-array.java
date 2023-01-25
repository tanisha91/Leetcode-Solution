class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n<=1){
            return 1;
        }
        int idx=n-k;
        
        return nums[idx];
    }
}