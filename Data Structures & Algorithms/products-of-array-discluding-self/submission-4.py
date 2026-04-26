class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l = nums.copy()

        for i in range(len(l)):
            product = 1
            for j in range(0,len(l)):
                if i == j:
                    continue
                product *= nums[j]
            l[i] = product
        return l
            
            
        