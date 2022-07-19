package greedy.baekjoon_20300;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_20300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for(int i =0; i<n; i++)
            arr[i] = sc.nextLong();
        Arrays.sort(arr);
        long answer = -1;
        long sum;
        if(n %2 == 0){
            for(int i =0; i<n/2; i++){
               sum = arr[i] + arr[n-1-i];
               if(sum > answer)
                   answer = sum;
            }
        }
        else{
            for(int i =0; i<n/2; i++){
                sum = arr[i] + arr[n-2-i];
                if(sum > answer)
                    answer = sum;
            }
            if(answer < arr[n-1])
                answer = arr[n-1];
        }

        System.out.println(answer);

    }
}
