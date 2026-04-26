class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:

        res = []

        
        for i in range(0,len(nums)-k+1):

            Max_elements = []

            for j in range(i,i+k):

                Max_elements.append(nums[j])
            
            res.append(max(Max_elements))
        
        return res



        