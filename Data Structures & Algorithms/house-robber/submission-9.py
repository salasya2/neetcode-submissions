class Solution:
    def rob(self, nums: List[int]) -> int:

        '''
        min amount i can rob without alerting the police.

        if I chose iTH house i can't choose (i+1)th house.

        i can also choose from 5 houses A,B,C,D,E
        A, D which might give me the maximum amount


        we can either choose i or choose i+1 

        1 , 1, 3 , 3      2 , 9 , 8, 3, 6

                1 -> 3      2 - > 8 -> 6
                |           |
                1 -> 3      9 -> 3

        max(cost[i] + f(i+2:n),f(i+1:n))

        DP:-

        dp[i] = max(nums[i] + dp[i+2],dp[i+1])
        return dp[0]
        '''

        n = len(nums)
        if n <= 2:
            return max(nums)
        dp = [0] * n
        for i in range(2):
            dp[n-i-1]=nums[n-i-1]
        for i in range(n-3,-1,-1):

            dp[i] = max(nums[i] + dp[i+2],dp[i+1])

        return dp[0]
        