class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = []

        for i in range(1<<len(nums)):

            subsets = [nums[j]  for j  in range(len(nums)) if (i & (1 << j))]
            res.append(subsets)
        
        return res
        