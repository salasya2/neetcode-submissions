class Solution:
    def minWindow(self, s: str, t: str) -> str:

        if len(t) > len(s):

            return ""

        res = ""
        count = float("inf")

        count1 = defaultdict(int)

        # count2 = [0] * 26


        for c in t:

            count1[c] += 1

        for  i in range(len(s)):

            
            if s[i] in t:
                c = 0
                mp = count1.copy()
                for j in range(i, len(s)):
                    
                    
                    # print(s[j])
                    if mp[s[j]] > 0:
                        c += 1
                        mp[s[j]] -= 1
                        # print("hit",c)
                    
                    if c == len(t):
                        if count > j - i + 1 :
                            # print("count -",count)
                            res = s[i:j+1]

                            print(res)
                            count =  len(res)
                            break
                    

        return res





            
            


        