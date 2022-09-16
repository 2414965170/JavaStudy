package com.example;

import java.util.*;

public class Test {
    private static int[] root;
    private static int paths=0;
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        int[][] edges=new int[M][2];
        for (int i = 0; i < M; i++) {
            int k= sc.nextInt();
            int v= sc.nextInt();
            edges[i][0]=k;edges[i][1]=v;
        }
        for (int i = 0; i < N; i++) {
            if(validPath(N,edges,i,i))
            paths++;
        }
        System.out.println(paths);
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        root = new int[n];
        for (int i = 0 ; i < n; i++) root[i] = i;
        for (int[] edge : edges) {
            union(edge[0], edge[1]);
            if (find(source) == find(destination)) return true;
        }
        return find(source) == find(destination);
    }

    private static void union(int p, int q) {
        root[find(p)] = find(q);
    }

    private static int find(int n) {
        return root[n] == n ? n : (root[n] = find(root[n]));
    }
}
