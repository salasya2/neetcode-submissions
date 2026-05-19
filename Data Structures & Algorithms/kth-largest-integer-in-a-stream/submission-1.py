class KthLargest:

    def __init__(self, k: int, nums: List[int]):

        self.k = k
        self.nums = []
        i = 0
        while i < self.k and i < len(nums):
            self.nums.append(nums[i])
            i+=1
        
        heapq.heapify(self.nums)
        while i < len(nums):
            heapq.heappush(self.nums,nums[i])
            if len(self.nums) > self.k:
                heapq.heappop(self.nums)
            i += 1

    def add(self, val: int) -> int:
        
        
        heapq.heappush(self.nums,val)
        if len(self.nums) > self.k:
            heapq.heappop(self.nums)
        return self.nums[0]
        
