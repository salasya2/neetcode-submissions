class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        n = len(strs)
        if n == 0:
            return ""
        
        
        if n == 1:
            return strs[0]
        substr = ""
        strs.sort()
        for i in range(len(strs[0])):
            substr += strs[0][i]
            
            for j in range(1, n):

                for c,ct in zip(substr,strs[j]):
                    if c != ct:
                        return substr[:-1]
        
        return substr