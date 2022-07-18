package greedy.bacekjoon_11399;

import java.util.Arrays;
import java.util.Scanner;

public class Bacekjoon_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n;i ++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int answer = 0;
        int wait = 0;
        for(int i =0; i<n; i++){
            wait += arr[i];
            answer += wait;
        }
        System.out.println(answer);
    }

}
