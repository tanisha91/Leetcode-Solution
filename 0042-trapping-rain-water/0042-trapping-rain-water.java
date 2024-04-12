class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int []pre=new int[n];
        int suf[]=new int[n];
        int max1=height[0];
        pre[0]=height[0];
        for(int i=1;i<n;i++)
        {
            max1=Math.max(max1,height[i]);
            pre[i]=max1;
        }
        // System.out.print(Arrays.toString(pre));
        suf[n-1]=height[n-1];
        max1=height[n-1];
         for(int i=n-2;i>=0;i--)
        {
            max1=Math.max(max1,height[i]);
            suf[i]=max1;
        }
         // System.out.print(Arrays.toString(suf));
        int min=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<n-1;i++){
             ans+=Math.min(pre[i],suf[i])-height[i];
        }
        return ans;
    }
}