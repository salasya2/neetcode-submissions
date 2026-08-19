class TrieNode:
    
    def __init__(self):
        self.children = {}
        self.isEnd = False
        self.count = 0

class Trie:

    def __init__(self):
        self.root = TrieNode()
    
    def insert(self,word):
        curr = self.root

        for c in word:
            if c not in curr.children:
                curr.children[c] = TrieNode()
            curr.children[c].count += 1  
            curr = curr.children[c] 
            
        curr.isEnd = True
    


class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:

        trie = Trie()

        for s in strs:
            trie.insert(s)
        
        curr = trie.root
        substr = []
        for c in strs[0]:
            print(substr,curr.count)
            if curr.children[c].count != len(strs):
                return "".join(substr)
            
            substr.append(c)
            curr = curr.children[c]

        return "".join(substr)
         