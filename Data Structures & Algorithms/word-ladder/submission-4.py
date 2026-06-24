class Solution:
    def ladderLength(self, beginWord: str, endWord: str, wordList: List[str]) -> int:

        
        if endWord not in wordList:
            return 0
        graph = defaultdict(list)
        wordList.append(beginWord)
        for word in wordList:
            for i in range(len(word)):
                pattern = word[:i]+"*"+word[i+1:]
                graph[pattern].append(word)

        visited= defaultdict(bool)
        
        q = deque([beginWord])
        visited[beginWord] = True
        res = 0
        while  q:

            for i in range(len(q)):
                word = q.popleft()

                if word == endWord:
                    return res + 1
                
                for j in range(len(word)):
                    pattern = word[:j]+"*"+word[j+1:]
                    for v in graph[pattern]:
                        if not visited[v]:
                            visited[v] = True
                            q.append(v)
            res+=1
        
        return 0
                    





