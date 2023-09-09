class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        int n=nums.length;
        
        for(int i=0;i<n;i++){
          if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int l=j+1;
                int k=n-1;
                while(k>l){
                   long sum=0; 
                sum+=nums[i]+nums[j];
                sum+=nums[l]+nums[k];
                if(sum==target){
            List<Integer> lis=Arrays.asList(nums[i],nums[j],nums[l],nums[k]);
                list.add(lis);
                     k--;
                l++; 
                while(k>l && nums[k]==nums[k+1]) k--;
                while(k>l && nums[l]==nums[l-1]) l++;
                                          
            }
             else if(sum<target) l++;
               else k--;                            
            }
        }
        }
                                           return list;
    }
}