package backtracking.bacekjoon_15649;

import java.io.IOException;
import java.util.*;

public class Bacekjoon_15649 {
    public static int[] arr;
    public static boolean[] visit;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[m];
        visit = new boolean[n];

        permutation(n,m,0);
    }

    public static void permutation(int n, int m,int level){
        if(level == m){
            for(int var : arr)
                System.out.print(var+" ");
            System.out.println();
        }else{
            for(int i =0; i<n; i++){
                if(!visit[i]){
                    visit[i] = true;
                    arr[level] = i+1;
                    permutation(n,m,level+1);
                    visit[i] = false;
                }
            }
        }
    }
}
