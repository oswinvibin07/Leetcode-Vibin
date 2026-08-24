// Last updated: 8/24/2026, 12:01:22 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3        if(x<0){
4            return false;
5        }
6        int rev = 0;
7        int  num= x;
8
9        while (num!= 0) {
10            rev= rev*10 + num%10;
11            num=num/10;
12        }
13
14        return (rev == x);
15    }
16}