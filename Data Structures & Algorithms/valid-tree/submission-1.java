class Solution {
    public boolean validTree(int n, int[][] edges) {
        
        List<Integer> g[] =new ArrayList[n];

        for(int i=0;i<n;i++)
        {
            g[i] = new ArrayList<>();
        }

        for(int[] edg: edges)
        {
            g[edg[0]].add(edg[1]);
            g[edg[1]].add(edg[0]);
        }
        Set<Integer> visited=new HashSet<>();
        
        if(!dfs(0,-1,g,visited))
                return false;
        return visited.size()==n;
    }

    private boolean dfs(int u, int parent, List<Integer>[] g, Set<Integer> visited)
    {
        if(visited.contains(u))
            return false;

        visited.add(u);

        for(int i :g[u])
        {
            if(i==parent)
                continue;
            if(!dfs(i,u,g,visited))
                return false;
        }
        return true;
    }
}
