class Solution {
    public int numberOfSpecialChars(String word) {
        int a[]=new int[26];
        int b[]=new int [26];
         Arrays.fill(a,-1);
        Arrays.fill(b,-1);
       char ch[]=word.toCharArray();
          for(int i=0;i<ch.length;i++ ){
              if(ch[i]>='a' && ch[i]<='z'){
                  a[ch[i]-'a']=i;
              }
              else if(b[ch[i]-'A']==-1){
                  b[ch[i]-'A']=i;
              }

        } 
        int cnt=0;
        for(int i=0;i<26;i++){
            if(a[i]!=-1 && b[i]!=-1 && a[i]<b[i]){
                cnt++;
            }

        }
        return cnt;
    }
}