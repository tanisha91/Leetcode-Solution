class Solution {
    int drow[]={-1,0,1,0};
    int dcol[]={0,1,0,-1};
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int tm=0;int cntF=0;
        boolean vis[][]=new boolean [n][m];
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    vis[i][j]=true;
                    q.add(new pair(i,j,tm));
                }
                if(grid[i][j]==1) cntF++;
                
            }
        }
        int cnt=0;
        while(!q.isEmpty()){
            int strt=q.peek().f;
            int end=q.peek().s;
            int time=q.peek().t;
            q.remove();
             tm=Math.max(tm,time);
            for(int i=0;i<4;i++){
                int sr=strt+drow[i];
                int sc=end+dcol[i];
                if(sr>=0 && sc>=0 && sr<n&& sc<m && grid[sr][sc]==1 && !vis[sr][sc]){
                    vis[sr][sc]=true;
                    q.add(new pair(sr,sc,time+1));
                    cnt++;
                }
            }
           
        }
        return (cnt==cntF) ? tm :-1;
    }
}
class pair{
    int f;
    int s;
    int t;
    pair(int f,int s,int t){
        this.f=f;
        this.s=s;
        this.t=t;
    }
}