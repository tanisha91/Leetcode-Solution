class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0;
        for(int i=0;i<columnTitle.length();i++){
            int d=columnTitle.charAt(i)-'A'+1;
            
            sum =sum*26+d;
                
        }
        return sum;
    }
}