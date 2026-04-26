class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;

        int index=-1;
        int l=0,h=n-1;

        while(l<=h)
        {
            
            int m=(l+h)/2;
            if(nums[l]==target) return l;
            if(nums[h]==target) return h;
            if(nums[m]==target)
                return m;
            else if( nums[m] > nums[h])
            {
                if(target > nums[h] && target <nums[m]){
                    h=m-1;
                    System.out.println("Gone to h : "+h);
                }
                else{
                     l=m+1;
                     System.out.println("Gone to l : "+l);
                }
            }
            else 
            {
                if(target > nums[m] && target<= nums[h]){
                     l=m+1;
                     System.out.println("Gone to l : "+l);
                }
                else{
                    h=m-1;
                    System.out.println("Gone to h : "+h);
                }
            }
            
            
        }
        return index;
    }
}
