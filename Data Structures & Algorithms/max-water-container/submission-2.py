class Solution:
    def maxArea(self, heights: List[int]) -> int:

        water = -1

        n = len(heights)

        for i in range(n):

            for j in range(n):

                water = max(water, (j-i)*min(heights[j],heights[i]))
        
        return water

        