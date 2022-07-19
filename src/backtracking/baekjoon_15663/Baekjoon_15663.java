package backtracking.baekjoon_15663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_15663 {
    public static final StringBuilder sb = new StringBuilder();
    public static int[] arr;
    public static int[] input;
    public static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        arr = new int[m];
        input = new int[n];
        visit = new boolean[n];

        for(int i =0; i<n; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);
        permutation(n,m,0);

        System.out.println(sb);
    }

    public static void permutation(int n, int m, int depth){
        if(m == depth){
            for (int var : arr)
                sb.append(var).append(" ");
            sb.append("\n");
            return;
        }
        int tmp = -1;
        for(int i =0; i<n;i++){
            if(!visit[i] && tmp != input[i]){
                visit[i] = true;
                arr[depth] = input[i];
                tmp = input[i];
                permutation(n,m,depth+1);
                visit[i] = false;
            }
        }
    }
}
