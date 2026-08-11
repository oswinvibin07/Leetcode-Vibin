// Last updated: 8/11/2026, 2:53:36 PM
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        return fib(n-1) + fib(n-2);
    }
}