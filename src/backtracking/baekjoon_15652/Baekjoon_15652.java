package backtracking.baekjoon_15652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_15652 {
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[m];

        permutation(n,m,0,0);
        System.out.println(sb);
        br.close();
    }
    public static void permutation(int n, int m, int start, int depth){
        if(depth == m){
            for(int var : arr)
                sb.append(var).append(" ");
            sb.append("\n");
            return;
        }

        for(int i = start; i<n; i++){
            arr[depth] = i+1;
            permutation(n,m,i,depth+1);
        }

    }
}
