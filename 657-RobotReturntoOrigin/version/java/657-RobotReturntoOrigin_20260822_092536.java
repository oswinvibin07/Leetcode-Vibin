// Last updated: 8/22/2026, 9:25:36 AM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int x = 0, y = 0;
4
5        for (int i = 0; i < moves.length(); i++) {
6            char c = moves.charAt(i);
7
8            if (c == 'U') y++;
9            if (c == 'D') y--;
10            if (c == 'R') x++;
11            if (c == 'L') x--;
12        }
13
14        return x == 0 && y == 0;
15    }
16}