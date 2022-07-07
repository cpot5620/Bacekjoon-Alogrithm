package bacekjoon_11047;

import java.util.*;
public class Bacekjoon_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = sc.nextInt();
        int answer=0;
        int[] arr = new int[n];

        for(int i =0;i<n;i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for(int i =n-1; i>=0; i--){
            if(total == 0)
                break;
            else if(arr[i] <= total){
                answer += total / arr[i];
                total -= (total/arr[i]) * arr[i];
            }
        }
        System.out.println(answer);

    }
}