package backtracking.baekjoon_15651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_15651 {
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        permutation(n, m, 0);
        System.out.println(sb);
        br.close();
    }

    public static void permutation(int n, int m, int depth) {
        if (m == depth) {
            for (int var : arr)
                sb.append(var).append(" ");
            sb.append("\n");
        } else {
            for (int i = 0; i < n; i++) {
                arr[depth] = i + 1;
                permutation(n, m, depth + 1);
            }
        }
    }
}
