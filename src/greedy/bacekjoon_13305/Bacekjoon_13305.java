package greedy.bacekjoon_13305;

import java.util.Scanner;

public class Bacekjoon_13305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] path = new long[n];
        long[] price = new long[n];
        long answer = 0;
        long min_price;
        for (int i = 0; i < n-1; i++) {
            path[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextLong();
        }
        min_price = price[0];
        for(int i =0; i <n-1;i ++){
            if(min_price > price[i])
                min_price = price[i];

            answer+= min_price * path[i];
        }


        System.out.println(answer);
    }
}
