class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        n = len(nums)

        mp = {}

        for i in nums:
            mp[i] = 1 + mp.get(i,0)

        freq = [[] for i in range(n)]
        for num, count in mp.items():
            freq[count-1].append(num)
    
        res=[]
        print(mp)
        print(freq)
        for i in range(n-1,-1,-1):
            if k==0:
                break
            for j in freq[i]:
                k=k-1
                res.append(j)
                if k==0:
                    break
        return res


