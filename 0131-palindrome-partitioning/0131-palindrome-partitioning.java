class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
       List<String> al= new ArrayList<>();
        backTrack(s,al,ans,0);
        return ans;
    }
    void backTrack(String s,List<String> al,List<List<String>> ans,int strt){
        if(strt==s.length()){
            ans.add(new ArrayList<>(al));
            return ;
        }
        
        for(int i=strt+1;i<=s.length();i++){
            if(isPal(s,strt,i-1)){
                al.add(s.substring(strt,i));
                backTrack(s,al,ans,i);
                al.remove(al.size()-1);
            }
        }
    }
    
    boolean isPal(String s,int i,int j){
        while(i<=j){
        if(s.charAt(i++)!=s.charAt(j--)){
            return false;
        }
        }
        return true;
    }
}