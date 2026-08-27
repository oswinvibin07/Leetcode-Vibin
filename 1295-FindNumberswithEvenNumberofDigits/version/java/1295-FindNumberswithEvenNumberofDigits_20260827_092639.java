// Last updated: 8/27/2026, 9:26:39 AM
1import java.util.*;
2class Solution {
3    public int findNumbers(int[] nums) {
4        int count=0;
5        for(int i:nums){
6            String s=Integer.toString(i);
7            if(s.length()%2==0){
8                count++;
9            }
10        }
11        return count;
12    }
13}