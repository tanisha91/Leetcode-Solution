class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
       // ArrayList<Integer>a=new ArrayList<>();
       long sum=0;
        long max=0;
       for(int i=nums.length-1;i>=0;--i){
           sum +=nums[i];
         /*  a.add(sum);
       }
    int max=0;
        for(int i=0;i<nums.length;i++){*/
            if(sum>0){
                max++;
            }
          // else break;
       }
        return (int)max;
    }
}