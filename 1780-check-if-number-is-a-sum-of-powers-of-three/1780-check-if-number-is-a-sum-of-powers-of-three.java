class Solution {
    public boolean checkPowersOfThree(int n) {
        int t=n;
//         if(!mod(n))
//        return true;
//     }
    
//     int mod(int n){
//         if(n==0)
//             return true;
        
//        int i=0,ans=0,res;
//         while(i<=16){
//         int pow=(int)Math.pow(3,i);
//     if(pow<=t){
//        ans=i;
//         res=i ; 
//     }
//        else
//            break;
    
//             i++;
           
//     }
//     int h=mod(t-res);
        
//         return false;
        while(n>0){
            int rem=n%3;
            if(rem==2)
                return false;
            else
                n /=3;
                continue;
        }
        return true;
}
    }