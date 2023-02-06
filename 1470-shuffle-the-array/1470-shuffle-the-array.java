class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []b=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     b[i]=nums[i];
        // }
        int p=0;
        //for(int j=0;j<nums.length;j++){
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                b[i]=nums[p];
                p++;
            }
            else{
                b[i]=nums[n];
                n++;
            }
        }
       // }
        return b;
    }
}