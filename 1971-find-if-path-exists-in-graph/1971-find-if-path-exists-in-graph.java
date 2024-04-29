class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(n==0) return true;
            boolean vis[]=new boolean[n];
        boolean flag=true;
        vis[source]=true;
        while(flag){
            flag=false;
            for(int ed[]:edges){
            if(vis[ed[0]]!=vis[ed[1]]){
                vis[ed[0]]=true;
                 vis[ed[1]]=true;
                flag=true;
            }
        }
            if(vis[destination]) return true;
        }
        return false;
    }
}