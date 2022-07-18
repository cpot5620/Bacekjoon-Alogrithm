package backtracking.bacekjoon_15654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bacekjoon_15654 {
    public static int[] input;
    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        input = new int[n];
        arr = new int[m];
        visit = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<n; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);

        permutation(n,m,0);
        System.out.println(sb);

        br.close();
    }

    public static void permutation(int n, int m, int depth){
        if(m == depth){
            for(int var : arr)
                sb.append(var).append(" ");
            sb.append("\n");
            return;
        }

        for(int i =0; i<n; i++){
            if(!visit[i]){
                visit[i] = true;
                arr[depth] = input[i];
                permutation(n,m,depth+1);
                visit[i] = false;
            }
        }

    }
}
