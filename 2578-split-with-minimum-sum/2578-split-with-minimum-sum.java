class Solution {
    public int splitNum(int num) {
        int p=0;
      int len=(int)(Math.log10(num)+1);
        int a[]=new int[len];
        while(num>0){
            int rem=num%10;
            a[p]=rem;
            num /=10;
            p++;
            
        }
        int c=0,d=0;
        Arrays.sort(a);
        int sum=0,dogit=0;
       for(int i=0;i<a.length;i++){
           dogit=a[i];
           if(i%2==0){
               c *=10;
              c+= dogit;
           }
           else{
               d *=10;
              d+= dogit;
           }
       }
        return c+d;
    }
}