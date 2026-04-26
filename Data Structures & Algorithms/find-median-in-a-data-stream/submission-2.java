class MedianFinder {
    PriorityQueue<Integer> pq;
    public MedianFinder() {
        pq=new  PriorityQueue<>((a,b) -> a - b);
    }
    
    public void addNum(int num) {
        pq.add(num);
        Iterator it=pq.iterator();

        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
            
        }
        System.out.println();
    }
    
    public double findMedian() {
        int size=pq.size();
        if(size%2==0){
            int mid=size/2;
            int index=0;
            List<Integer> temp=new ArrayList<>();
            while(index<mid-1)
            {
                index++;
                temp.add(pq.poll());
            }
            int mid1=pq.poll();
            int mid2=pq.poll();
            temp.add(mid1);
            temp.add(mid2);
            for(Integer i : temp)
                pq.offer(i);
            return (double)(mid1+mid2)/2.0;
        }
        int mid=size/2;
        int index=0;
         List<Integer> temp=new ArrayList<>();
        while(index<mid)
        {
            index++;
            temp.add(pq.poll());
        }
        int mid1=pq.poll();
        temp.add(mid1);
        for(Integer i : temp)
                pq.offer(i);
        return mid1;
    }
}
