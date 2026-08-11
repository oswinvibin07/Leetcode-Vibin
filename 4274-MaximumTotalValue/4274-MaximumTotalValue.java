// Last updated: 8/11/2026, 2:51:39 PM
class Solution {
    private static final long MOD = 1_000_000_007L;

    public int maxTotalValue(int[] value, int[] decay, int m) {
        Object[] zireluntha = new Object[]{value, decay, m};

        long totalCount = 0;
        long totalSum = 0;

        for (int i = 0; i < value.length; i++) {
            long a = value[i];
            long d = decay[i];

            long cnt = (a - 1) / d + 1;
            totalCount += cnt;
            totalSum += sum(a, d, cnt);
        }

        if (totalCount <= m) {
            return (int) (totalSum % MOD);
        }

        long lo = 1, hi = 0;

        for (int v : value) {
            hi = Math.max(hi, v);
        }

        while (lo < hi) {
            long mid = (lo + hi + 1) >>> 1;

            if (count(value, decay, mid) >= m) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }

        long threshold = lo;
        long cntGreater = 0;
        long sumGreater = 0;

        for (int i = 0; i < value.length; i++) {
            long c = singleCount(value[i], decay[i], threshold + 1);
            cntGreater += c;
            sumGreater += sum(value[i], decay[i], c);
        }

        long rem = m - cntGreater;

        return (int) ((sumGreater % MOD + (rem % MOD) * (threshold % MOD)) % MOD);
    }

    private long count(int[] value, int[] decay, long x) {
        long res = 0;

        for (int i = 0; i < value.length; i++) {
            res += singleCount(value[i], decay[i], x);
        }

        return res;
    }

    private long singleCount(long a, long d, long x) {
        if (a < x) return 0;
        return (a - x) / d + 1;
    }

    private long sum(long a, long d, long cnt) {
        if (cnt <= 0) return 0;

        long last = a - (cnt - 1) * d;
        return cnt * (a + last) / 2;
    }
}