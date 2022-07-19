package backtracking.baekjoon_15650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_15650 {
    public static int[] arr;
    public static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        visit = new boolean[n];

        permutation(n,m,0,0);
    }
    public static void permutation(int n, int m,int start, int depth){
        if(m == depth){
            //int[] tmp = arr.clone();
           // Arrays.sort(tmp);
           // if(Arrays.equals(arr,tmp)) {
                for (int var : arr)
                    System.out.print(var + " ");
                System.out.println();
            //}
            return;
        }

        for(int i =start; i<n; i++){
            if(!visit[i]){
                visit[i] = true;
                arr[depth] = i+1;
                permutation(n,m, i+1,depth+1);
                visit[i] =false;
            }
        }

    }
}
