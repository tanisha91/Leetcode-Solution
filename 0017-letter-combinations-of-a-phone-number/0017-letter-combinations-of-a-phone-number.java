class Solution {
   String res[] = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
             List<String> mst=new ArrayList<>();
            return mst;
        }
        List<String> ans=get(digits);
       
        return ans;
    }
    List<String> get(String s){
        if(s.length()==0){
            List<String> mst=new ArrayList<>();
            mst.add("");
            return mst;
        }
        char ch=s.charAt(0);
        String sub=s.substring(1);
        List<String> path=get(sub);
        
        List<String> ms=new ArrayList<>();
        String curr=res[ch-'2'];
        for(int i=0;i<curr.length();i++){
        
            for(String x: path){
                ms.add(curr.charAt(i)+x);
            }
        }
        return ms;
    }
    
}