class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:

        res = -1


        for i in range(len(heights)):
            Min_ht = heights[i]
            for j in range(i,len(heights)):
                
                Min_ht = min(Min_ht,heights[j])
                res = max(res,(j-i+1)*Min_ht)

        return res


        