class Solution {
    public boolean canFinish(int numCourses, int[][] pre) {
        ArrayList<Integer> graph[]=new ArrayList[numCourses];

        for(int i=0;i<numCourses;i++)
        {
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<pre.length;i++)
        {
            
            graph[pre[i][0]].add(pre[i][1]);
        }
        Set<Integer> visited=new HashSet<>();
        for(int i=0;i<numCourses;i++)
        {
            if(!dfs(i,visited,graph))
                return false;
        }
        return true;
    }

    public boolean dfs(int g, Set<Integer> visited,ArrayList<Integer> graph[])
    {
        if(visited.contains(g))
            return false;
        visited.add(g);
        for(int c:graph[g])
        {
            if(!dfs(c,visited,graph))
                return false;
        }
        visited.remove(g);
        return true;

    }

}
