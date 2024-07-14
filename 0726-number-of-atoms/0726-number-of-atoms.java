class Solution {
    public String countOfAtoms(String s) {
        Stack<HashMap<String,Integer>>map=new Stack<>();
        map.push(new HashMap<>());
        int idx=0;
        int n=s.length();
        while(idx<n){
            char ch=s.charAt(idx);
            if(ch=='('){
                map.push(new HashMap<>());
                idx++;
            }
            else if(ch==')'){
                  HashMap<String,Integer>Count_map=new HashMap<>(map.pop());
                idx++;
                String mul="";
                while(idx<n && Character.isDigit(s.charAt(idx))){
                    mul+=s.charAt(idx);
                    idx++;
                }
                if(mul.length()>0){
                int ans=Integer.parseInt(mul);
                for(String a: Count_map.keySet()){
                    Count_map.put(a,Count_map.get(a)*ans);
                }
                }
                for(String a: Count_map.keySet()){
                    map.peek().put(a,map.peek().getOrDefault(a,0)+Count_map.get(a));
                }
            }
            
            else{
                String atom="";
                atom+=s.charAt(idx);
                idx++;
                while(idx<n && Character.isLowerCase(s.charAt(idx))){
                    atom+=s.charAt(idx);
                    idx++;
                }
                int ans=1;
                 String mul="";
                while(idx<n && Character.isDigit(s.charAt(idx))){
                    mul+=s.charAt(idx);
                    idx++;
                }
                if(mul.length()>0)
                 ans=Integer.parseInt(mul);
                 map.peek().put(atom,map.peek().getOrDefault(atom,0)+ans);
            }
            }
            TreeMap<String,Integer> mp=new TreeMap<>(map.peek());
            String res="";
            for(String z: mp.keySet())
            {
                res+=z;
                int cnt=mp.get(z);
                if(cnt>1){
                    res+=cnt;
                }
            }        
        return res;
    }
}