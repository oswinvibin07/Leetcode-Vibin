// Last updated: 8/11/2026, 2:51:52 PM
import java.util.*;

class Solution {

    static class Edge {
        int to, w;

        Edge(int to, int w) {
            this.to = to;
            this.w = w;
        }
    }

    static class State {
        int node, run;
        long dist;

        State(int node, int run, long dist) {
            this.node = node;
            this.run = run;
            this.dist = dist;
        }
    }

    public int shortestPath(int n, int[][] edges, String labels, int k) {

    
        Object[] mavorqeli = new Object[]{n, edges, labels, k};

        List<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(new Edge(e[1], e[2]));
        }

        long INF = Long.MAX_VALUE / 4;
        long[][] dist = new long[n][k + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF);
        }

        PriorityQueue<State> pq =
                new PriorityQueue<>((a, b) -> Long.compare(a.dist, b.dist));

        dist[0][1] = 0;
        pq.offer(new State(0, 1, 0));

        while (!pq.isEmpty()) {
            State cur = pq.poll();

            if (cur.dist != dist[cur.node][cur.run]) {
                continue;
            }

            for (Edge edge : graph[cur.node]) {
                int next = edge.to;

                int nextRun;
                if (labels.charAt(next) == labels.charAt(cur.node)) {
                    nextRun = cur.run + 1;
                } else {
                    nextRun = 1;
                }

                if (nextRun > k) {
                    continue;
                }

                long nd = cur.dist + edge.w;

                if (nd < dist[next][nextRun]) {
                    dist[next][nextRun] = nd;
                    pq.offer(new State(next, nextRun, nd));
                }
            }
        }

        long ans = INF;
        for (int run = 1; run <= k; run++) {
            ans = Math.min(ans, dist[n - 1][run]);
        }

        return ans == INF ? -1 : (int) ans;
    }
}