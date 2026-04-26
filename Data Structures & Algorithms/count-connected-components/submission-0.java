class Solution {
    public int countComponents(int n, int[][] edges) {
        
        List<Integer> g[] =new ArrayList[n];

        for(int i=0;i<n;i++)
            g[i] = new ArrayList<>();
        
        for(int[] edg: edges)
        {
            g[edg[0]].add(edg[1]);
            g[edg[1]].add(edg[0]);
        }

        int res=0;

        boolean[] visit= new boolean[n];

        for(int i=0;i<n;i++)
        {
            if(!visit[i])
            {
                dfs(i,g,visit);
                res++;
            }
        }
        return res;
    }

    private void dfs(int u, List<Integer> g[] ,boolean[] visit)
    {
        if(visit[u]) return;
        visit[u] = true;
        for(int v : g[u])
        {
            dfs(v,g,visit);
        }
        
    }
}
