# from 
class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:

        
        count = defaultdict(int)

        for c in s1:
            count[c] = 1 + count.get(c,0)

        for i,c in enumerate(s2):

            if count[c] == 0:
                continue
            
            cf = count.copy()

            cf[c] -= 1


            j = i + 1
            length = 1

            if length == len(s1):
                return True

            while j < len(s2):
                

                print(s2[j]," ",s2[i])
                if cf[s2[j]] == 0:
                    break
                
                length +=1
                cf[s2[j]] -= 1

                if length == len(s1):
                    return True
                j+=1
            
        return False
                



        return True
        