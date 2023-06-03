class Solution {
    public int countPrimes(int n) {
        boolean []isprime=new boolean[n];
        Arrays.fill(isprime,true);
        
        for(int i=2;i<n;i++)
            if(isprime[i])
                for(int j=2*i;j<n;j+=i)
                    isprime[j]=false;
            
        
        int cnt=0;
        
        for(int i=2;i<n;i++){
            if(isprime[i])
                cnt++;
    }
        return cnt;
    }
  
}

