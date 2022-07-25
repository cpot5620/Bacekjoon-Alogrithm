package backtracking.baekjoon_14712;

import java.util.Scanner;

public class Baekjoon_14712 {
    public static int N;
    public static int M;
    public static int answer;
    public static boolean[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new boolean[N][M];
        answer = 0;

        dfs(0,0);
        System.out.println(answer);
    }

    public static void dfs(int x,int y){

        if(y == N){
            for(int i =0; i<N-1;i++){
                for(int j =0; j<M-1; j++){
                    if(arr[i][j] && arr[i+1][j] && arr[i][j+1] && arr[i+1][j+1])
                        return;
                }
            }
            answer ++;
            return;
        }

        int nextY = x+1 == M ? y+1 : y;
        int nextX = nextY == y+1 ? 0 : x+1;

        arr[y][x] = true;
        dfs(nextX,nextY);

        arr[y][x] = false;
        dfs(nextX,nextY);
    }
}
