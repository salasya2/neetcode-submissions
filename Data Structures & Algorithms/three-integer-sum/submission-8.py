class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        n = len(nums)

        nums = sorted(nums)
        res = []
        
        i = 0
        while i < n:

            j = i + 1
            k = n - 1

            while j < k :

                target = nums[j] + nums[i] + nums[k]
                if  target == 0:
                    res.append([nums[i],nums[j],nums[k]])
                    j = j+1
                    k = k-1
                    while j < n-1 and nums[j-1] == nums[j]:
                        j = j+1
                    while k > 0 and nums[k] == nums[k+1]:
                        k = k-1
                elif target < 0:
                    j = j+1
                else:
                    k = k-1
            i = i + 1
            while i < n - 1 and nums[i-1] == nums[i]:
                i+=1
            
        return res


