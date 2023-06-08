//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printNos(N);
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {

    void printNos(int N) {
        // code here
    
     print(N);
    }
    void print(int n){
       
        if(n==0) return ;
      
       
        System.out.print(n+" ");
         print(--n);
    }
}
