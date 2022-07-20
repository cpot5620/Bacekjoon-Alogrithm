package backtracking.baekjoon_1182;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_1182 {
    public static int[] input;
    public static int m;
    public static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        m =Integer.parseInt(st.nextToken());
        input = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        sumOfSubset(n,0,0);

        //공집합인 경우
        if(m == 0)
            answer--;

        System.out.println(answer);

        br.close();
    }

    public static void sumOfSubset(int n,int sum,int depth){
        if(depth == n){
            if(sum == m)
                answer++;
            return;
        }
        sumOfSubset(n,sum+input[depth],depth+1);
        sumOfSubset(n,sum,depth+1);
    }
}
