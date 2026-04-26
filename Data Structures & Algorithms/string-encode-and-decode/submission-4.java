
class Solution {

    public String encode(List<String> strs) {
        String s="";
        for(String str : strs)
        {
            s+=str+'/';
        }
        return s;
    }

    public List<String> decode(String str) {
        
        int n=str.length();
        List<String> result = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            String s="";

            while(i<n && str.charAt(i)!='/')
            {
                s+=str.charAt(i);
                i++;
            }
            result.add(s);
        }
        return result;
    }
}
