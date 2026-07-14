class Solution:
    def jump(self, nums: List[int]) -> int:
        
        '''
        Brute Force:

            i = n  - 2
            s = 1
            if  i + nums[i]  >= n -1 :
                dp[i] = 1

        '''
        memo = {}
        memo[len(nums) - 1] = 0
        
        def helper(nums, i):
            if i == len(nums) - 1:
                return memo[i]
            if  i== len(nums) - 2:
                memo[len(nums)-2] = 1
                return 1
            if i in memo:
                return memo[i]
            if i + nums[i] >= len(nums) - 1:
                memo[i] = 1
                return 1
            end = min(i+nums[i] + 1,len(nums))
            min_steps = 100000000
            for j in range(i+1, end):
                min_steps = min(min_steps, 1 + helper(nums,j))
            memo[i] = min_steps
            return memo[i]
        return helper(nums,0)