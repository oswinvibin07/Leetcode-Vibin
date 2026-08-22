// Last updated: 8/22/2026, 9:48:44 AM
1class Solution {
2    public String sortSentence(String s) {
3        String[] arr = s.split(" ");
4        String[] ans = new String[arr.length];
5        for (String i : arr)
6            ans[i.charAt(i.length() - 1) - '0' - 1] = i;
7        StringBuilder sb = new StringBuilder();
8        for (String i : ans)
9            sb.append(i.substring(0, i.length() - 1) + " ");
10        return sb.substring(0, sb.length() - 1).toString();
11    }
12}