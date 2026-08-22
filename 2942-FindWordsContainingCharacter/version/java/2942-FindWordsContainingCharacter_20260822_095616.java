// Last updated: 8/22/2026, 9:56:16 AM
1class Solution {
2    public List<Integer> findWordsContaining(String[] words, char x) {
3        List<Integer> list = new ArrayList();
4        int index = 0;
5        for(String str : words){
6            if(str.indexOf(x) != -1)
7                list.add(index);
8                index++;
9        }
10        return list;
11    }
12}