class Solution {
    ArrayList<ArrayList<Integer>> al=new ArrayList<>();
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean vis[]=new boolean[n];
        list(al,n,isConnected);
        int cnt=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                cnt++;
                dfs(i,vis,al);
            }
        }
   return cnt;
    
    }
    
    void list(ArrayList<ArrayList<Integer>> al,int n,int[][] isConnected){  
        for(int i=0;i<n;i++){
            al.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                al.get(i).add(j);
                al.get(j).add(i);
            }
            }
            }
    }
    void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>> al){
        vis[node]=true;
        for(Integer it : al.get(node)){
            if(vis[it]==false){
                vis[it]=true;
                dfs(it,vis,al);
            }
        }
    }
}