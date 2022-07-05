package bacekjoon_1758;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bacekjoon_1758 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer []arr = new Integer[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());

        long answer = 0;
        for(int i =0; i<n; i++){
            if(arr[i] - i < 0 )
                break;
            answer += arr[i] - i ;
        }

        System.out.println(answer);
    }
}
