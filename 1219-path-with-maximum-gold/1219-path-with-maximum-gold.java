class Solution {
     int dx[]={-1,0,0,1};
        int dy[]={0,-1,1,0};
    public int getMaximumGold(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0)
                ans=Math.max(ans,dfs(i,j,n,m,grid));
            }
        }
        return ans;
    }
   int dfs(int i,int j,int n,int m,int[][] grid){
        if(i<0 || j<0  || i>=n|| j>=m || grid[i][j]==0) return 0;
       
       int max=0,curr=grid[i][j];
        for(int d=0;d<4;d++){
            int nx=i+dx[d];
            int ny=j+dy[d];
            grid[i][j]=0;
         max=Math.max(max,curr+dfs(nx,ny,n,m,grid));
            grid[i][j]=curr;
        }
       return max;
    }
        
}