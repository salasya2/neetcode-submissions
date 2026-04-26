class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        
        l = set(nums)
        res = 0
        

        for  num in l:
        
            if num-1 in l: 
                continue
            count = 1
            prev = num
            while prev + 1 in l:
                prev = prev+1
                count+=1
            res = max(res,count)
        return res