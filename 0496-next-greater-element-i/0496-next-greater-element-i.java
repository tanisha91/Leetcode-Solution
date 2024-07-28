class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        int n=nums2.length;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            
            if(!st.isEmpty()){
                if(nums2[i]<=st.peek()){
                    map.put(nums2[i],st.peek());
                   
                }
            }
            else{
                map.put(nums2[i],-1);
            }
             st.push(nums2[i]);
        }
        int a[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            a[i]=map.get(nums1[i]);
        }
        return a;
    }
}