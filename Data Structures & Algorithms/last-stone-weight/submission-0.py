class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:

        heapq.heapify_max(stones)

        res = 0

        while len(stones) > 1:
            stone1 = heapq.heappop_max(stones)
            stone2 = heapq.heappop_max(stones)

            if stone1 == stone2:
                continue
            
            elif stone1 > stone2:
                val = stone1 - stone2
                heapq.heappush_max(stones,val)
            
            else:
                val = stone2 - stone1
                heapa.heappush_max(stones,val)
        
        if len(stones) == 1:
            return stones[0]
        return 0
        