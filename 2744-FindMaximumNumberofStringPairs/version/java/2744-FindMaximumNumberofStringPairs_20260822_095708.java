// Last updated: 8/22/2026, 9:57:08 AM
1class Solution {
2    public int maximumNumberOfStringPairs(String[] words) {
3        Set<String> set = new HashSet<>();
4        int count = 0;
5        
6        for (String str : words) {
7            if (set.contains(str)) {
8                count++;
9            }
10            String rev = new StringBuilder(str).reverse().toString();
11            set.add(rev);
12        }
13        
14        return count;
15    }
16}