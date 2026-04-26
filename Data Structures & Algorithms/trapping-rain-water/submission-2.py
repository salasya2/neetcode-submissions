class Solution:
    def trap(self, height: List[int]) -> int:


        res = 0

        n = len(height)
        
        for i in range(n):

            l = 0
            r = 0

            j = 0
            k = i + 1
            
            while j<i and k < n :

                l = max(height[j],l)
                r = max(height[k],r)

                j+=1
                k+=1
            
            while j < i:
                l = max(height[j],l)
                j+=1
            while k<n:
                r = max(height[k],r)
                k+=1



            res +=max(0, min(r,l) - height[i])

            
        return res       