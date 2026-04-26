class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;


        int i=0,j=1;
        int result=0;
        while(j<n)
        {
            if(prices[j]>prices[i])
            {
                result=Math.max(prices[j]-prices[i],result);
            }
            else
            {
                i=j;
            }
            j++;
        }
        return result;
    }
}
