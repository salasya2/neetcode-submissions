class Solution:
            
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        res={}
        
        
        for s in strs:
            
            l =[0]*26
            
            for c in s:
                l[ord(c)-97]+=1
            if tuple(l) not in res:
                res[tuple(l)] = []
            res[tuple(l)].append(s)
    
        return list(res.values())


        
