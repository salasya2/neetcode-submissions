class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer> g[] = new ArrayList[numCourses];


        for(int i=0;i<numCourses;i++)
            g[i]= new  ArrayList<>();

        int[] indegree= new int[numCourses];
        for(int[] pre : prerequisites)
        {
            indegree[pre[1]]++;
            g[pre[0]].add(pre[1]);
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
                q.add(i);
        }

        int finish=0;

        while(!q.isEmpty())
        {
            int node=q.poll();
            finish++;

            for(int nei : g[node])
            {
                indegree[nei]--;
                if(indegree[nei]==0)
                {
                    q.add(nei);
                }
            }
        }
        return finish==numCourses;
        

        

    }
}
