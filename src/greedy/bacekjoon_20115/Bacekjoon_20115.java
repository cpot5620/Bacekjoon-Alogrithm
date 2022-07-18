package greedy.bacekjoon_20115;

import java.util.Arrays;
import java.util.Scanner;

public class Bacekjoon_20115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        double answer = arr[n-1];
        for(int i =0; i<n-1; i++){
            answer += (double)arr[i] / 2;
        }

        System.out.println(answer);
    }
}
