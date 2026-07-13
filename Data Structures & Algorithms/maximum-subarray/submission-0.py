class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        '''
            brute force :-
            two loops

            O(n^2)
        '''
        res = -10000000
        for i in range(len(nums)):
            Sum = nums[i]
            res = max(res,Sum)
            for j in range(i+1,len(nums)):
                
                Sum += nums[j]
                res = max(res,Sum)
        
        return res