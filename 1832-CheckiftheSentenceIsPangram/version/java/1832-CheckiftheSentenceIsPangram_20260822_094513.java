// Last updated: 8/22/2026, 9:45:13 AM
1class Solution {
2    public boolean checkIfPangram(String sentence) {
3        int n=sentence.length();
4        if(n<26) return false;
5        int[] f=new int[26];
6        for(int i=0;i<n;i++){
7            char c=sentence.charAt(i);
8            f[c-'a']++;
9        }
10        for(int i=0;i<f.length;i++){
11            if(f[i]==0){
12                return false;
13            }
14        }
15        return true;
16    }
17}