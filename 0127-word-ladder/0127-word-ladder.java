class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<pair> q=new LinkedList<>();
        Set<String> set=new HashSet<>();
        for(String x: wordList){
            set.add(x);
        }
        q.add(new pair(beginWord,1));
        set.remove(beginWord);
        while(!q.isEmpty()){
            
        String ch=q.peek().s;
        int time=q.peek().t;
            if(ch.equals(endWord)){
                return time;
            }
        q.remove();
        for(int i=0;i<ch.length();i++){
            char vh[]=ch.toCharArray();
            for(char c='a';c<='z';c++){
                vh[i]=c;
                String as=new String(vh);
                if(set.contains(as)){
                    set.remove(as);
                    q.add(new pair(as,time+1));
                }
            }
        }
    }
        return 0;
    }
}
class pair{
    String s;
    int t;
    pair(String s,int t){
        this.s=s;
        this.t=t;
    }
}