// Last updated: 8/22/2026, 9:21:27 AM
1class Solution {
2    public int calPoints(String[] operations) {
3        Deque<Integer> stk = new ArrayDeque<>();
4
5        for (String op : operations) {
6            switch (op) {
7                case "+" -> {
8                    int top = stk.pop();
9                    int newTop = stk.peek();
10                    stk.push(top);
11                    stk.push(top + newTop);
12                }
13                case "D" -> {
14                    stk.push(stk.peek() * 2);
15                }
16                case "C" -> {
17                    stk.pop();
18                }
19                default -> stk.push(Integer.parseInt(op));
20            }
21        }
22
23        int score = 0;
24        for (int val : stk) {
25            score += val;
26        }
27
28        return score;
29    }
30}