class Solution:
    def isPalindrome(self, s: str) -> bool:

        t = ""
        l =""
        for c in s[::-1]:
            if (c<='z' and str(c) >='a') or (c>='A' and c<='Z') or (c>=str(0) and c<=str(9)) :
                t += c
        for c in s:
            if (c<='z' and str(c) >='a') or (c>='A' and c<='Z') or (c>=str(0) and c<=str(9)) :
                l += c
        print(t.lower())
        print("")
        print(l.lower())
        if l.lower() == t.lower(): 
            return True
        return False
        