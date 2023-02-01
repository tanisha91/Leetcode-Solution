class Solution {
    public String gcdOfStrings(String str1, String str2) {
        //String s= str1/str2;
//         int flag=0;
//         for(int i=0;i<str2.length();i++){
//             if(str1.charAt(i)==str2.charAt(i)){
//                 flag=1;
            
//             break;
//             }
//         }
//         String ans="";
//         if(flag==1){
            
//             for(int i=0;i<str1.length();i++){
//             if(str1.charAt(i)!=str2.charAt(i)){
//                 ans += str1.charAt(i);
//         }
//             }
        
//         return ans;
//         }
//         return "";
        if(!(str1+str2).equals(str2+str1)) return "";
        int a1=gcd(str1.length(),str2.length());
        return str2.substring(0,a1);
        
    }
    public int gcd(int m,int n){
        return n==0 ? m : gcd(n,m%n);
    }
}