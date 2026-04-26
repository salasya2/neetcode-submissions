class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int m=strs.length;
        List<List<String>> sol=new ArrayList<>();
        Map<String,Integer> mp=new HashMap<>();
        for(String str:strs)
        {
            int [] res= new int [26];

            for(char c : str.toCharArray())
            {
                res[c-'a']++;
            }
            String s="";
            for(int i=0;i<26;i++)
            {
                s+=(char)res[i];
            }

            if(mp.containsKey(s))
            {
                int idx=mp.get(s);
                sol.get(idx).add(str);
            }

            else{

                sol.add(new ArrayList());
                sol.get(sol.size()-1).add(str);
                mp.put(s,sol.size()-1);
            }
        }
        return sol;
    }
}
