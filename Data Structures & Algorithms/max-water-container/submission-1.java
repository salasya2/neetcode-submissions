class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;

        

        int i=0,j=n-1;
        int res=-1;

        while(i<j)
        {
            int width=j-i;
            int height=Math.min(heights[i],heights[j]);
            res=Math.max(res,height*width);
            if(heights[i]<=heights[j]) i++;
            else
                j--;
        }
        return res;
    }
}
