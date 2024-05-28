class Solution {
    int drow[]={1,0,-1,0};
    int dcol[]={0,-1,0,1};
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;       
        int dist[][]=new int [n][m];
        int vis[][]=new int [n][m];  
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new pair(i,j,0));
                    vis[i][j]=1;
                }
                else{
                    vis[i][j]=0;
                }
            }
        }
        while(!q.isEmpty()){
            int p=q.peek().f;
            int q1=q.peek().s;
            int r=q.peek().t;
            q.remove();
            dist[p][q1]=r;
            for(int k=0;k<4;k++){
                int sr=p+drow[k];
                int sc=q1+dcol[k];
               if(sr>=0 && sc<m && sc>=0 && sr<n && vis[sr][sc]==0){
                   q.add(new pair(sr,sc,r+1));
                   vis[sr][sc]=1;
               }
                
            }
        }
        return dist;
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