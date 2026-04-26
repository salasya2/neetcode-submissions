class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        List<List<String>> res=new ArrayList<>();
        Map<String,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int[] ch=new int[26];
            for(int j=0;j<strs[i].length();j++)
            {
                ch[strs[i].charAt(j)-'a']++;
            }
            String key=Arrays.toString(ch);
            if(mp.containsKey(key))
            {
                    res.get(mp.get(key)).add(strs[i]);
            }
            else
            {
                mp.put(key,res.size());
                // System.out.println(mp);
                res.add(new ArrayList<String>());
                res.get(res.size()-1).add(strs[i]);
            }

        }
        return res;
    }
}
