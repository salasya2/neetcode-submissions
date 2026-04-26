class Solution {

    public String encode(List<String> strs) {
        String s="";
        for(String str:strs){
            s=s+str+"/";
        }
        System.out.println(s);
        return s;
    }

    public List<String> decode(String str) {
        int n=str.length();
        List<String> res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {   
            String s="";
            while(str.charAt(i)!='/')
            {
                s+=str.charAt(i);
                i++;
            }
            res.add(s);
        }
        return res;
    }
}
