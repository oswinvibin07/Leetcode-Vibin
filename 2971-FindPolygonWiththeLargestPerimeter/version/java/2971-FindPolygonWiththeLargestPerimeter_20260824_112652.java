// Last updated: 8/24/2026, 11:26:52 AM
1class Solution {
2    public long largestPerimeter(int[] nums) {
3        long sum = 0;
4        Arrays.sort(nums);
5        for (int num : nums) {
6            sum += num;
7        }
8        int n = nums.length;
9        for (int i = n - 1; i >= 2; i--) {
10            sum -= nums[i];
11            if (sum > nums[i]) {
12                return sum + nums[i];
13            }
14        }
15        return -1;
16    }
17}
18