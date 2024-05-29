class Solution {
    List<List<Integer>> ls=new ArrayList<>();
    
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int m=graph[0].length;
        int vis[]=new int[n];
        Arrays.fill(vis,-1);
        for(int i=0;i<n;i++){
            if(vis[i]==-1){
                if(dfs(vis,graph,0,i)==false) return false;
            }
        }
        return true;
    }
   boolean dfs(int vis[],int [][]a,int col,int node){
        vis[node]=col;
        for(Integer it : a[node]){
            if(vis[it]==-1){
                if(dfs(vis,a,1-col,it)==false){
                    return false;
                }
            }
            else if(vis[it]==col){
return false;
            }
        }
        return true;
    }
}