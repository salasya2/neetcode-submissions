class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:


        res = [0] * len(temperatures)

        for i in range(len(temperatures)):
            
            colder = temperatures[i]

            for j in range(i+1,len(temperatures)):
        
                if temperatures[j] - temperatures[i] > 0:

                    res[i]=j-i
                    break
                
        return res


