class Solution {
    public long pickGifts(int[] gifts, int k) {
            Arrays.sort(gifts);
        for(int i=gifts.length-1,j=1;j<=k;j++)
        {
            if(gifts[i]==1)
            {
                break;
            }
            int p=(int)(Math.sqrt(gifts[i]));
            gifts[i]=p;
            Arrays.sort(gifts);
        }
        long s=0;
        for(int i:gifts)
        {
            s+=(long)i;
        }    
        

          return s;  
            
        
    }
}