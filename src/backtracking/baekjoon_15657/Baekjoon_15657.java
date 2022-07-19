package backtracking.baekjoon_15657;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_15657 {
    public static StringBuilder sb = new StringBuilder();
    public static int[] arr;
    public static int[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[m];
        input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);

        permutation(n, m, 0, 0);
        System.out.println(sb);
    }

    public static void permutation(int n, int m, int start, int depth) {
        if (m == depth) {
            for (int var : arr)
                sb.append(var).append(" ");
            sb.append("\n");
            return;
        }

        for (int i = start; i < n; i++) {
            arr[depth] = input[i];
            permutation(n, m, i, depth + 1);
        }

    }
}
