class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;

        int i=0,j=1;
        int maxProfit=0;
        while(j<n && i<n)
        {
            
            int profit=prices[j]-prices[i];
            if(profit>0){
            maxProfit=Math.max(maxProfit,profit); 
                j++;
            }
            else{
                i++;
                if(i==j) j++;
                continue;
            }
            
            
        }
        return maxProfit;
    }
}
