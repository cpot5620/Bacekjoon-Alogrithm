package backtracking.baekjoon_15666;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_15666 {
    public static StringBuilder sb = new StringBuilder();
    public static int[] arr;
    public static int[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        input = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            input[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(input);

        permutation(n, m, 0, 0);

        System.out.println(sb);
        br.close();
    }

    public static void permutation(int n, int m, int start, int depth) {
        if (depth == m) {
            for (int var : arr)
                sb.append(var).append(" ");
            sb.append("\n");
            return;
        }
        int before = -1;
        for (int i = start; i < n; i++) {
            if (before != input[i]) {
                arr[depth] = input[i];
                before = input[i];
                permutation(n, m, i, depth + 1);
            }
        }
    }
}
