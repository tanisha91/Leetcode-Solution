class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        int deg[]=new int[n];
        List<List<Integer>> ls=new ArrayList<>();
         Queue<Integer>q=new LinkedList<>();
                for(int i=0;i<n;i++){
                    ls.add(new ArrayList<>());
                }
        for(int i=0;i<n;i++){
            for(int j=0;j<graph[i].length;j++){
                ls.get(graph[i][j]).add(i);
                deg[i]++;
            }
        }
        for(int i=0;i<n;i++){
            if(deg[i]==0){
                q.add(i);
            }
        }
        List<Integer> ans=new ArrayList<>();
       
        while(!q.isEmpty()){
            int node=q.peek();
            ans.add(node);
            q.remove();
            for(int it:ls.get(node)){
                deg[it]--;
                if(deg[it]==0){
                    q.add(it);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}