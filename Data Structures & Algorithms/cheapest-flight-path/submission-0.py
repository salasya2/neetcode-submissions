class Solution:
    def findCheapestPrice(self, n: int, flights: List[List[int]], src: int, dst: int, k: int) -> int:
        
        '''
        have to return the flight itineracy with atmost k stops and return -1 if not possible

        brute force - log all the paths, filter  paths with atmost k stops and return cheapest
        '''

        graph = defaultdict(list)

        for u,v, c in flights:
            graph[u].append([v,c])
        
        

        min_heap = [[0,0,src]]
        seen = {}
        while min_heap:

            c,stops,u = heapq.heappop(min_heap)
            
            if u == dst:
                # print(c,stops)
                if stops <= k +1:
                    return c
            
            for v,c_v in graph[u]:

                if v not in seen:
                    heapq.heappush(min_heap,[c_v+c,stops+1,v])
        return -1 

            