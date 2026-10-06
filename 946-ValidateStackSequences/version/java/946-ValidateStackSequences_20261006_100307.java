// Last updated: 10/6/2026, 10:03:07 AM
1class Solution {
2    public boolean validateStackSequences(int[] pushed, int[] popped) {
3        Stack<Integer>stack=new Stack<>();
4        int j=0;
5        for(int i=0;i<pushed.length;i++){
6            stack.push(pushed[i]);
7            while(!stack.isEmpty()&&stack.peek()==popped[j]){
8                stack.pop();
9                j++;
10            }
11        }
12        return stack.isEmpty();
13    }
14}