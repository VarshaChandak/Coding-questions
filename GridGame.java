public class Solution {
    public int gridGame(int[][] g) {
        int n = g[0].length;
        long[] t = new long[n + 1], b = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            t[i] = t[i - 1] + g[0][i - 1];
            b[i] = b[i - 1] + g[1][i - 1];
        }

        long res = Long.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            long u = t[n] - t[i], d = b[i - 1];
            res = Math.min(res, Math.max(u, d));
        }

        return (int) res;
    }
}
