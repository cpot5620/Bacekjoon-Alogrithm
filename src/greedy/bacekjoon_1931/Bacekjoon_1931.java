package greedy.bacekjoon_1931;
import java.util.*;

public class Bacekjoon_1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i =0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int answer = 0;
        long end_time = -1;

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                else
                    return o1[1] - o2[1];
            }
        });

        for(int i =0; i<n; i++){
            if(end_time <= arr[i][0]){
                answer++;
                end_time = arr[i][1];
            }
        }

        System.out.println(answer);
    }
}
