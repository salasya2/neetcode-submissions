class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        Hmap={}

        for i in range(len(nums)):


            rem = target - nums[i]
            if rem in Hmap :
                return [Hmap[rem],i]
            Hmap[nums[i]] = i
        