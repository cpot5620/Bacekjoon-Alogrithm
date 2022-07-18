package greedy.bacekjoon_21758;
import java.util.*;
public class Bacekjoon_21758 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sum = new int[n];
        int answer = 0 ;
        arr[0] = sc.nextInt();
        sum[0] = arr[0];
        for(int i =1; i<n; i++){
            arr[i] = sc.nextInt();
            sum[i] = sum[i-1] + arr[i];
        }

        //벌벌꿀
        for(int i =1; i<n;i ++){
            int tmp = (sum[n-1] - arr[0] - arr[i]) + (sum[n-1] - sum[i]);
            answer = Math.max(answer,tmp);
        }

        //꿀벌벌
        for(int i =1; i<n-1; i++){
            int tmp = (sum[n-1] - arr[n-1] -arr[i]) + (sum[i-1]);
            answer = Math.max(answer,tmp);
        }

        //벌꿀벌
        for(int i =1; i<n-1; i++){
            int tmp = (sum[i] - arr[0]) + (sum[n-1] - sum[i-1] - arr[n-1]);
            answer = Math.max(answer,tmp);
        }

        System.out.println(answer);
    }
}
