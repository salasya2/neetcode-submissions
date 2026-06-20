class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:

        graph = [[] for i in range(numCourses)]
        visited = set()
        cycle = set()

        for u , v in prerequisites:

            graph[u].append(v)
        
        output = []
        def dfs(u):

            if u in cycle:
                return False
            
            if u  in visited:
                return True
            
            cycle.add(u)
            
            for v in graph[u]:

                if not dfs(v):
                    return False 
                
            cycle.remove(u)
            visited.add(u)
            output.append(u)
            return True


        for i in range(numCourses):
            if not dfs(i):
                return []
        
        return output
        