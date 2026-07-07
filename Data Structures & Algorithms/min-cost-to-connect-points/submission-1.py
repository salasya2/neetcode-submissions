class Solution:
    def minCostConnectPoints(self, points: List[List[int]]) -> int:

        '''
        i need to connect all the points with minimum cost

        brute force:-

        for each item to other items compute distance
        [0,4,6,6,6]
        [4,0,2,2,2]
        [6,2,0,2,2]
        [6,2,2,0,0]
        [6,2,2,0,0]

        [0,0] -> [2,2],4 ; [3,3],6 ; [2,4],6; [4,2],6;
        [2,2] -> [3,3] 6; [2,4], 6; [4,2], 6;
        [3,3] -> [2,4],2 ; [4,2] 2 
        [2,4] -> [4,2], 0

        '''
        graph = defaultdict(list)
        n = len(points)
        for i in range(n):
            x1, y1 = points[i]
            for j in range(i + 1, n):
                x2, y2 = points[j]
                dist = abs(x1 - x2) + abs(y1 - y2)
                graph[i].append([dist, j])
                graph[j].append([dist, i])
        
        
        ans = 0
        seen = set()
        res = [[0,0]]
        
        while res:
            dist, i = heapq.heappop(res)
            
            if i in seen:
                continue
            ans+=dist
            seen.add(i)
            for neicost, nei in graph[i]:
                if nei not in seen:
                    heapq.heappush(res,[neicost,nei])
        

        return ans
        


        