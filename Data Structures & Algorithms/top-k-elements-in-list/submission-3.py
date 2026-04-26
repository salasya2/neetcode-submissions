class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        hashMap=defaultdict(int)

        for num in nums:
            hashMap[num]+=1

        sorted_dict = dict(sorted(hashMap.items(),key=lambda item:item[1],reverse=True))
        l=list(sorted_dict.keys())
        return l[0:k]

