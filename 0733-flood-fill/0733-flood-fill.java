class Solution {
       public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length,n=image[0].length;
        int sel= image[sr][sc];
        if(sel==color)
            return image;
        dfs(image,sr,sc,m,n,color,sel);
        return image;
    }
    public  void dfs(int[][] grid,int i,int j,int m,int n,int col,int sel)
    {
        grid[i][j]=col;
        int dx[]={-1,0,1,0};
        int dy[]={0,1,0,-1};
        
        for(int k=0;k<4;k++)
        {
            int x=i+dx[k];
            int y=j+dy[k];
            if(x>=0&&y>=0&&x<m&&y<n&&grid[x][y]==sel)
            {
                dfs(grid,x,y,m,n,col,sel);
            }
        }
        return;
    }
}