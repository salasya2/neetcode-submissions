class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        pre = [0]*n
        post = [0]*n
        
        pre[0] =nums[0]
        post[n-1] = nums[n-1]

        for i in range(1,n):
            pre[i] = nums[i] * pre[i-1]
            post[n-i-1] = post[n-i] * nums[n-i-1]

        res = [0] * n

        for i in range(n):
            if i == 0:
                res[i] = post[i+1]
            elif i == n-1:
                res[i] = pre[i-1]

            else:
                res[i] = post[i+1] * pre[i-1]

        return res
