class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        res = {}

        for s in strs:
            key = "".join(sorted(s))
            print(key)
            if key not in res:
                res[key] = [s]
            else:
                res[key].append(s)

        
        return [p for p in res.values()]