class Twitter:

    def __init__(self):
        self.timestamp = 0
        self.tweets = defaultdict(list)
        self.followees = defaultdict(set)

    def postTweet(self, userId: int, tweetId: int) -> None:
        self.tweets[userId].append([self.timestamp,tweetId])
        if len(self.tweets[userId]) > 10:
            self.tweets[userId].pop(0)
        self.timestamp -= 1   

    def getNewsFeed(self, userId: int) -> List[int]:
        
        res = []
        minHeap = []

        self.followees[userId].add(userId)

        if len(self.followees[userId]) >= 10:
            maxHeap = []
            for followeeId in self.followee[userId]:
                if followeeId in self.tweets:
                    index = len(self.tweets[followeeId]) - 1

                    count, tweetId = self.tweets[followeeId][index]

                    heapq.heappush_max(maxHeap,[count, tweetId, followeeId, index - 1])
                    if len(maxHeap) > 10:
                        heap.heappop_max(maxHeap)
                
            while maxHeap:
                count, tweetId, followeeId, index = heapq.heappop_max(maxHeap)
                heapq.heappush(minHeap,[count, tweetId, followeeId, index])
            
        else:
            for followeeId in self.followees[userId]:
                if followeeId in self.tweets:
                    index=  len(self.tweets[followeeId]) -1
                    count, tweetId = self.tweets[followeeId][index]
                    heapq.heappush(minHeap,[count, tweetId, followeeId, index-1])
        while minHeap and len(res) < 10:
            count, tweetId, followeeId, index = heapq.heappop(minHeap)
            res.append(tweetId)
            if index >=0:
                count, tweetId = self.tweets[followeeId][index]
                heapq.heappush(minHeap,[count, tweetId, followeeId,index-1])
            
        return res

    def follow(self, followerId: int, followeeId: int) -> None:
        if followerId != followeeId:
            self.followees[followerId].add(followeeId)

    def unfollow(self, followerId: int, followeeId: int) -> None:
        self.followees[followerId].discard(followeeId)

        
