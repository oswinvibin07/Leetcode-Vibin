// Last updated: 8/22/2026, 9:23:31 AM
1class Solution {
2    public int recursiveBinarySearch(int[] nums, int target, int start, int end) 
3    {
4        if (start <= end)
5        {
6            int mid = start + (end - start) / 2;
7            if (nums[mid] == target)
8            {
9                return mid;
10            }
11            else if (nums[mid] >= target)
12            {
13                return recursiveBinarySearch(nums, target, start, mid - 1);
14            }
15            else
16            {
17                return recursiveBinarySearch(nums, target, mid + 1, end);
18            }
19        }
20        return -1;
21    }
22
23    public int search(int[] nums, int target) 
24    {
25        int st = 0;
26        int end = nums.length - 1;
27        return recursiveBinarySearch(nums, target, st, end);
28    }
29}