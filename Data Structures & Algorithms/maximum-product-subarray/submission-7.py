class Solution:
    def maxProduct(self, nums: List[int]) -> int:

        '''
        brute Force Algorithm :-

        O(n^2) and O(1)
        
        '''
        res = float("-inf")
        if len(nums) == 1:
            return nums[0]
        for i in range(len(nums)):
            product = nums[i]
            res = max(res,product)
            for j in range(i+1,len(nums)):
                product *= nums[j]
                res = max(res,product)

        return res