class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String arr[]=s.trim().split("\\s+");
        
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]).append(" ");
        }
        return sb.toString().trim();
    }
}