class Solution {
    public int searchInsert(int[] nums, int target) {
        int strt=0,end=nums.length-1;
        while(strt<=end){
            int mid=strt+(end-strt)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                strt=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return find(nums,target);
    }
    public int find(int arr[],int tar){
        for(int i=0;i<arr.length;i++){
            if(tar<arr[i]){
                return i;
            }
        }
        return arr.length;
    }
}