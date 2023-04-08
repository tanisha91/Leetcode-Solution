class Solution {
    public boolean isGoodArray(int[] nums) {
         int ans=nums[0];
        
        if(nums.length==0){
            return false;
        }
       
       
            for(int i=1;i<nums.length;i++){
                ans=gcd(ans,nums[i]);
            }
            if (ans==1) return true;
            else return false;
        }
    
    int gcd(int a,int b){
        if(a==0)
            return b;
        else
            return gcd(b%a,a);
    }
}