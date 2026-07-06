class Solution:
    def findItinerary(self, tickets: List[List[str]]) -> List[str]:

        '''
        bfs queue

        push start node 'JFK'

        for all surrounding nodes, add the node and remove the edge.

        keep adding elements to the visited list 
        '''

        graph = {src:[] for src,dest in tickets}
        tickets.sort()
        print(tickets)
        for  u,v in tickets:
            graph[u].append(v)
        
        
        
        st = ['JFK']

        res = ['JFK']

        def dfs(u):
            if len(res) == len(tickets) + 1:
                return True
            
            if u not in graph:
                return False
            
            temp = list(graph[u])
            for i,v in enumerate(temp):
                graph[u].pop(i)
                res.append(v)
                if dfs(v):
                    return True
                graph[u].insert(i,v)
                res.pop()
            return False
        dfs('JFK')
        return res

        