class Solution {
    public boolean validPalindrome(String s) {
        int strt=0,end=s.length()-1;
        int flag=1;
        while(strt<end){
            if(s.charAt(strt)==s.charAt(end)){
                 strt++;
                end--;
                 
            }
            else{
                 return isPalindrome(s,strt+1,end) || isPalindrome(s,strt,end-1);
            }
                
        }
        
        return true ;
    }
    
    public boolean isPalindrome(String s , int left , int right){
        while(left<right){
        if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
          } else{
            return false ;
            }
       }
        
        return true ;
    }
        
}