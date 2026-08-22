// Last updated: 8/22/2026, 9:22:54 AM
1class RecentCounter {
2    private static final int[] records = new int[10000]; 
3    private int start;
4    private int end;
5
6    public RecentCounter() {        
7        start = 0;
8        end = 0;
9    }
10    
11    public int ping(int t) {
12        while (start < end && (t - records[start] > 3000)) { 
13            start++;
14        }
15        records[end++] = t; 
16        return end - start; 
17    }
18}
19
20/**
21 * Your RecentCounter object will be instantiated and called as such:
22 * RecentCounter obj = new RecentCounter();
23 * int param_1 = obj.ping(t);
24 */