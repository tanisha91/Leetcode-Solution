class Solution {
    public int numberOfSpecialChars(String word) {
        int cnt=0;
        int n=word.length();
    int a[]=new int[26];
        int b[]=new int[26];
        for(char ch:word.toCharArray())
        {
            if(ch>='a' && ch<='z'){
                a[ch-'a']++;
            }
            else{
                b[ch-'A']++;
            }
        }    
        for(int i=0;i<26;i++){
            if(a[i]!=0 && b[i]!=0){
                cnt++;
            }
        }
        return cnt;
    }
}