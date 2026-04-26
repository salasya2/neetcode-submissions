class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        

        index = -1
        for i in range(0,len(nums)):
            rem = target - nums[i]

            if rem in nums :
                try:
                    index = nums.index(rem,i+1)
                except Exception as e:
                    print(i," ",rem)
                    continue
                return [i,index]
        