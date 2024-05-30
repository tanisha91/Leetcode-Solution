class Solution {
    public int[] findOrder(int n, int[][] pre) {
        int m=pre.length;
        int deg[]=new int[n];
        int topo[]=new int[n];
        List<List<Integer>> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
                al.get(pre[i][1]).add(pre[i][0]);
                deg[pre[i][0]]++;
            }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(deg[i]==0){
                q.add(i);
            }
        }
    int k = 0; 
        int count=0;
    while(!q.isEmpty()){
        int rem = q.remove();
        count++;
        topo[k++]=rem;
        for(int i : al.get(rem)){
if(--deg[i] == 0){
q.add(i);
}
}

}
if(count!=n){
    return new int[0];
}
    return topo;
    }
}