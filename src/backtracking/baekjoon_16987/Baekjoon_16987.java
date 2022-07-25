package backtracking.baekjoon_16987;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_16987 {

    public static int[][] arr;
    public static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        answer = 0;
        dfs(n,0);
        System.out.println(answer);

    }

    public static void dfs(int n, int depth) {
        if (n == depth) {
            int tmp = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i][0] <= 0)
                    tmp++;
            }
            if (tmp > answer)
                answer = tmp;
            return;
        }

        if(arr[depth][0] <= 0)
            dfs(n,depth+1);
        else {
            boolean broken = false;
            for (int i = 0; i < n; i++) {
                if (i == depth || arr[i][0] <= 0)
                    continue;
                else {
                    broken = true;
                    arr[i][0] -= arr[depth][1];
                    arr[depth][0] -= arr[i][1];
                    dfs(n, depth + 1);

                    arr[i][0] += arr[depth][1];
                    arr[depth][0] += arr[i][1];
                }
            }
            if(!broken)
                dfs(n,depth+1);
        }

    }
}
