class Solution {
    public int countBeautifulPairs(int[] nums) {
        int n=nums.length;
   int res=0,ans=0;
        for(int i=0;i<n;i++){
            int first=nums[i];
            while(first>9) first/=10;
            for(int j=i+1;j<n;j++){
               int last=nums[j]%10;
                   if(gcd(first,last)==1)
                     res++;
               
            }
        }
      
        return res;
        }
    int gcd(int a,int b){
    if(b==0) return a;
    return gcd(b,a%b);
}
    // }
//     int first(int n){
//         while(n>10)
//         n/=10;
    
//     return n;
// }
    }
