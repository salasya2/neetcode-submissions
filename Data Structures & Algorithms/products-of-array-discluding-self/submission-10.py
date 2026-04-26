class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        

        pre = [1 for i in range(len(nums))]
        post = [1 for i in range(len(nums))]


        for i in range(1,len(nums)):
            pre[i] = pre[i-1]*nums[i-1]
            post[len(nums)-i-1] = post[len(nums)-i]* nums[len(nums)-i]
        
        print(pre)
        print(post)
        
        nums[0] = post[0]
        nums[len(nums)-1] = pre[len(nums)-1]
        for i in range(1,len(nums)-1):
            nums[i] = pre[i]*post[i]
        return nums

