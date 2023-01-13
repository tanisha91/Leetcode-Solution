class Solution {
    public int countDigits(int num) {
        int count=0;
        int val=num;
        while(num>0){
            int rem = num%10;
            if(val%rem==0)
                count++;
            //ans += (n%(num%10)==0);
          num=num/10;
            
        }
        return count;
    }
}