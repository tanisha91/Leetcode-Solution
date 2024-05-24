class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int cnt=0;
        boolean vis[]=new boolean[n];
        for(int i=0;i<isConnected.length;i++){
            if(!vis[i]){
                cnt++;
                dfs(i,vis,isConnected);
            }
        }
        return cnt;
    }
    
    void dfs(int node,boolean vis[],int[][]Con){
        if(vis[node]){
            return ;
        }
        vis[node]=true;
        for(int i=0;i<Con[0].length;i++){
            if(Con[node][i]==1){
                dfs(i,vis,Con);
            }
        }
    }
}