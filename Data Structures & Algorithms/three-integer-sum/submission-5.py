class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        nums = sorted(nums)
        
        res = set()

        for i in range(len(nums)-2):
          

            for j in range(i+1 , len(nums)-1):

                for k in range(j+1,len(nums)):

                    if i!=j and j!=k and i!=k and nums[i] + nums[j] + nums[k] == 0:
                        res.add(tuple([nums[i],nums[j],nums[k]]))
        
        return [list(i) for i in res]
        