class Solution:
    def rob(self, nums: List[int]) -> int:
        n = len(nums)
        if n == 0:
            return  0
        if n==1:
            return nums[0]
        if n == 2:
            return max(nums)
        dp = [0] * (n-1)
        l = len(dp)
        dp[l-1] = nums[n-1]
        dp[l-2] = max(nums[n-2],dp[l-1])

        for  i in range(l-3,-1,-1):
            dp[i] = max(nums[i+1]+dp[i+2],dp[i+1])
        
        max_num = max(dp[0],dp[1])

        dp = [0]*(n-1)

        dp[n-2]=nums[n-2]
        dp[n-3] = max(nums[n-3],dp[n-2])

        for i in range(n-4,-1,-1):
            dp[i] = max(nums[i]+dp[i+2],dp[i+1])
        max_num = max(max_num,max(dp[0],dp[1]))

        return max_num


        
    # def helper(self,nums:List[int]) -> int:
    #     n = len(nums)
    #     if n == 0:
    #         return  0
    #     if n==1:
    #         return nums[0]
    #     return max(nums[0]+self.helper(nums[2:]),nums[1]+self.helper(nums[3:]))