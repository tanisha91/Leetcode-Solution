class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<pair> q=new LinkedList<>();
        int drow[]={0,-1,0,1};
        int dcol[]={1,0,-1,0};
        int vis[][]=new int[n][m];
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1){
                    if(grid[i][j]==1){
                        q.add(new pair(i,j));
                       vis[i][j]=1; 
                    }
                }
            }
        }
        
        while(!q.isEmpty()){
            int d=q.peek().f;
            int e=q.peek().s;
            q.remove();
            for(int i=0;i<4;i++){
                int sr=d+drow[i];
                int sc=e+dcol[i];
                if(sr>=0 && sc>=0 &&sr<n && sc<m && vis[sr][sc]==0 && grid[sr][sc]==1){
                    q.add(new pair(sr,sc));
                    vis[sr][sc]=1;
                }  
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
         if(grid[i][j]==1 && vis[i][j]==0){
             cnt++;
         }
            }
         }
        return cnt;
    }
}
class pair{
    int f;
    int s;
    pair(int f,int s){
        this.f=f;
        this.s=s;
    }
}