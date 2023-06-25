class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt=0,j=0;;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                nums[j+1]=nums[i];
                j++;
            } 
        }
        return (j+1);
    }
}