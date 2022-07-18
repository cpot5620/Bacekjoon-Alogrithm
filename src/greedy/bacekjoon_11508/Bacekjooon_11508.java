package greedy.bacekjoon_11508;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bacekjooon_11508 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        Integer[] arr = new Integer[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < n ; i++){
            if((i+1) % 3 == 0)
                continue;

            answer+=arr[i];
        }

        System.out.println(answer);
    }
}
