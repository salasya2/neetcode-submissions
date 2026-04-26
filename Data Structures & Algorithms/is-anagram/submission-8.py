class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        sorted(s)
        

        if(sorted(s)==sorted(t)):
            return True
        return False
        