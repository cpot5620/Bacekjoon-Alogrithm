package backtracking.baekjoon_15664;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_15664 {
    public static StringBuilder sb = new StringBuilder();
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
        visit = new boolean[n];
        input = new int[n];

        for(int i =0; i< n; i++)
            input[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(input);

        permutation(n,m,0,0);

        System.out.println(sb);
        br.close();
    }

    public static void permutation(int n, int m, int start,int depth){
        if(m == depth){
            for (int var : arr)
                sb.append(var).append(" ");
            sb.append("\n");
            return;
        }

        int before = -1;
        for(int i =start; i<n; i++){
            if(!visit[i] && before != input[i]){
                visit[i] = true;
                arr[depth] = input[i];
                before = input[i];
                permutation(n,m, i+1,depth+1);
                visit[i] = false;
            }
        }
    }
}
