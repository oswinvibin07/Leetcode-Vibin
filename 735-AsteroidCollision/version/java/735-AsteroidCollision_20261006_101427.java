// Last updated: 10/6/2026, 10:14:27 AM
1import java.util.*;
2class Solution {
3    public int[] asteroidCollision(int[] asteroids) {
4        Stack<Integer>stack=new Stack<>();
5        for(int i=0;i<asteroids.length;i++){
6            boolean destroyed=false;
7            while(!stack.isEmpty()&&asteroids[i]<0&& stack.peek()>0){
8                if(stack.peek()<-asteroids[i]){
9                    stack.pop();
10                }
11                else if(stack.peek()==-asteroids[i]){
12                    stack.pop();
13                    destroyed=true;
14                    break;
15                }
16                else{
17                    destroyed=true;
18                    break;
19                }
20            }
21            if(!destroyed){
22                stack.push(asteroids[i]);
23            }
24        }
25        int[]result=new int[stack.size()];
26        for(int i=0;i<stack.size();i++){
27            result[i]=stack.get(i);
28        }
29        return result;
30    }
31}