// Last updated: 8/22/2026, 9:38:56 AM
1class Solution {
2    public String reverseOnlyLetters(String s) {
3        char[] ch = s.toCharArray();
4        StringBuilder letters = new StringBuilder();
5
6    
7        for (char c : ch) {
8            if (Character.isLetter(c)) {
9                letters.append(c);
10            }
11        }
12
13        
14        letters.reverse();
15
16        
17        int index = 0;
18
19        for (int i = 0; i < ch.length; i++) {
20            if (Character.isLetter(ch[i])) {
21                ch[i] = letters.charAt(index++);
22            }
23        }
24
25        return new String(ch);
26    }
27}