class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer>list=new ArrayList<>();
        int n=s.length();
        int m=p.length();
        if(p.length()>n){
            return list;
        }
        if(n==0){
            return list;
        }
        String p1=sort(p);
        for(int i=0;i<s.length()-p.length()+1;i++){
            if(p1.equals(sort(s.substring(i,i+p.length())))){
                list.add(i);
            }
        }
        return list;
    }
    
    public String sort(String s){
        char a[]=s.toCharArray();
        Arrays.sort(a);
        
    
    return new String(a);
    }
}