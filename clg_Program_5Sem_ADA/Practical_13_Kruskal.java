package clg_Program_5Sem_ADA;

import java.util.Arrays;

class Edge implements Comparable<Edge> {
    int source, destination, weight;

    public int compareTo(Edge compareEdge) {
        return this.weight - compareEdge.weight;
    }
}

class Graph {
    int V, E;
    Edge[] edge;

    Graph(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[e];
        for (int i = 0; i < e; i++) {
            edge[i] = new Edge();
        }
    }

    int find(int[] parent, int i) {
        if (parent[i] == -1)
            return i;
        return find(parent, parent[i]);
    }

    void union(int[] parent, int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        parent[xset] = yset;
    }

    void kruskalMST() {
        Edge[] result = new Edge[V];
        int e = 0;
        int i = 0;
        for (i = 0; i < V; i++) {
            result[i] = new Edge();
        }
        Arrays.sort(edge);
        int[] parent = new int[V];
        Arrays.fill(parent, -1);
        i = 0;
        while (e < V - 1) {
            Edge nextEdge = edge[i++];
            int x = find(parent, nextEdge.source);
            int y = find(parent, nextEdge.destination);
            if (x != y) {
                result[e++] = nextEdge;
                union(parent, x, y);
            }
        }
        System.out.println("Minimum Spanning Tree using Kruskal's Algorithm: ");
        int minimumCost = 0;
        for (i = 0; i < e; i++) {
            System.out.println(result[i].source + " - " + result[i].destination + " : " + result[i].weight);
            minimumCost += result[i].weight;
        }
        System.out.println("Minimum Cost: " + minimumCost);
    }

    public static void main(String[] args) {
        int V = 4; // Number of vertices
        int E = 5; // Number of edges
        Graph graph = new Graph(V, E);

        // Add edges
        graph.edge[0].source = 0;
        graph.edge[0].destination = 1;
        graph.edge[0].weight = 10;

        graph.edge[1].source = 0;
        graph.edge[1].destination = 2;
        graph.edge[1].weight = 6;

        graph.edge[2].source = 0;
        graph.edge[2].destination = 3;
        graph.edge[2].weight = 5;

        graph.edge[3].source = 1;
        graph.edge[3].destination = 3;
        graph.edge[3].weight = 15;

        graph.edge[4].source = 2;
        graph.edge[4].destination = 3;
        graph.edge[4].weight = 4;

        graph.kruskalMST();
    }
}
