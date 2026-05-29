class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        res = []
        subset=[]

        Sum = 0

        def dfs(i):
            nonlocal Sum
            if i>=len(nums) or Sum > target:
                return
            
            if Sum == target:
                res.append(subset.copy())
                return
            
            subset.append(nums[i])
            Sum += nums[i]
            dfs(i)
            subset.pop()
            Sum-=nums[i]
            dfs(i+1)
        
        dfs(0)
        return res