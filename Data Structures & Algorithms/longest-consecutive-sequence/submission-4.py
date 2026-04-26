class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        res = 0
        nums.sort()
        for i in range(len(nums)):
                
            prev = nums[i]
            count = 1
            
            for j in range(len(nums)):

                if i == j:
                    continue
                if prev + 1 == nums[j]:
                    prev = nums[j]
                    count+=1
            res = max(count,res)

        return res


                



        
        