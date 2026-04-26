class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l = [0] * len(nums)
        product = 1
        zero_cnt =0
        for i in nums:
            if i != 0:
                product*=i
            else:
                zero_cnt+=1
        if zero_cnt > 1: return [0] * len(l)
        for i in range(len(l)):
            if zero_cnt > 0:
                if nums[i]!=0:
                    l[i] = 0
                else:
                    l[i] = product
            else:
                l[i] = product//nums[i]
              
        

        return l
            
            
        