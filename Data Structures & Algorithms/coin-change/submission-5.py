class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:

        if amount == 0:
            return 0

        queue = deque([0])
        res = 0
        seen = [False] * (amount+1)
        seen[0] = True

        while queue:

            res += 1

            for _ in range(len(queue)):
                curr = queue.popleft()
                for coin in coins:
                    nxt = curr + coin

                    if nxt == amount:
                        return res
                    if nxt > amount or seen[nxt]:
                        continue
                    seen[nxt] = True
                    queue.append(nxt)
        
        return -1
            
        