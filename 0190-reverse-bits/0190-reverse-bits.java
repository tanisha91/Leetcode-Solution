public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
//         int a[]=new int[32];
//         for(int i=0;i<32;){
//             while(n>0){
//                 int rem=n%10;
//                 a[i]=rem;
//                 n /=10;
//                  i++;
//             }
           
//         }
       
//         int base=0 ,sum=0;
//         for(int i=31;i>=0;i--){
//            int ans= (int)(Math.pow(2,base));
//             sum +=a[i]*ans;
//             base++;
//         }
//         return sum;
        return Integer.reverse(n);
    }
}