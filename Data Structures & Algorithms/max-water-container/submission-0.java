class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int i=0;
        int j=n-1;
        int res=0;
        while(i<j)
        {
            int water=(j-i)*Math.min(heights[i],heights[j]);
            res=Math.max(res,water);
            if(heights[i]<heights[j]) i++;
            else
             j--;
        }
        return res;
    }
}
