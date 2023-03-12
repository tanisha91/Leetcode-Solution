class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
     char []c=words[i].toCharArray();
//for(int j=0;j<1;j++){
         int n=words[i].length()-1;
               if(c[0]=='a'||c[0]=='e'||c[0]=='i' ||c[0]=='o' || c[0]=='u'){
                if(c[n]=='a'||c[n]=='e'||c[n]=='i'||c[n]=='o'||c[n]=='u'){
                    count ++;
                    }
                   }
            //   }
            }
        return count;


    }
}