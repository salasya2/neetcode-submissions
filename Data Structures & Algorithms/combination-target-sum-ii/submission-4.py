class Solution:
   
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:

        res = []
        subsets  = []
        Sum = 0
        candidates.sort()

        def dfs(i,Sum):
            
            if Sum == target:
                res.append(subsets.copy())        
                return


            if i >= len(candidates) or Sum > target:
                return
            
            
            
            subsets.append(candidates[i])
            
            dfs(i+1,Sum+candidates[i])
            subsets.pop()
            
            while i +1 < len(candidates) and candidates[i] == candidates[i+1]:
                i+=1
            dfs(i+1,Sum)
        dfs(0,0)
        return res
        