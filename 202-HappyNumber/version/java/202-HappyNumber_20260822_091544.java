// Last updated: 8/22/2026, 9:15:44 AM
1import java.util.LinkedList;
2
3class Solution {
4    public boolean isHappy(int n) {
5        
6        int slow = n;
7        int fast = n;
8
9        do {
10            slow = square(slow);
11            fast = square(square(fast));
12        } while (slow != fast);
13
14
15
16        return slow == 1;
17    }
18    
19
20    public int square(int num) {
21        
22        int ans = 0;
23        
24        while(num > 0) {
25            int remainder = num % 10;
26            ans += remainder * remainder;
27            num /= 10;
28        }
29        
30        return ans;
31    }
32}