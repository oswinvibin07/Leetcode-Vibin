// Last updated: 8/24/2026, 11:20:35 AM
1class Solution {
2    public int firstUniqChar(String s) {
3      char st[]=s.toCharArray();
4      HashMap<Character,Integer>map=new HashMap<>();
5      for(char c:st){
6        map.put(c,map.getOrDefault(c,0)+1);
7      }
8        for (int i = 0; i < st.length; i++) {
9            if (map.get(st[i]) == 1) {
10                return i;
11            }
12        }
13        return -1;
14    }
15}