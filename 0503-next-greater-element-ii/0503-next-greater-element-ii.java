class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int a[]=new int[n];
        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%n]){
                st.pop();
            }
            if(i<n){
                if(!st.isEmpty() )
                    a[i]=st.peek();
                else{
                    a[i]=-1;
                }
            }
            st.push(nums[i%n]);
        }
        return a;
    }
}