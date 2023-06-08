//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        String s1="Yes";
        String s2="No";
        
       int sum=0;
       int x=n;
       while(n>0){
           int rem=n%10;
           sum+=(rem*rem*rem);
           n/=10;
       }
       if(sum==x) return s1;
       return s2;
    }
}