package backtracking.baekjoon_10971;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Baekjoon_10971 {
    static int[][] W;
    static boolean[] visit;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        W = new int[n][n];
        visit = new boolean[n];
        for(int i =0; i< n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<n; j++)
                W[i][j] = Integer.parseInt(st.nextToken());
        }

        for(int i =0; i<n; i++) {
            visit[i] = true;
            tsp(n, i, i, 0, 0);
            visit[i] = false;
        }
        System.out.println(answer);
    }
    public static void tsp(int n,int start,int now, int sum, int depth){

        if(depth == n-1){
            if(W[now][start] != 0) {
                sum += W[now][start];
                if(sum < answer)
                    answer = sum;
            }
            return;
        }

        for(int i =0; i<n; i++){
            if(!visit[i] && W[now][i] != 0){
                visit[i] = true;
                tsp(n,start,i,sum + W[now][i], depth+1);
                visit[i] = false;
            }
        }
    }
}
