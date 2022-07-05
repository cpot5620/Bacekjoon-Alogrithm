package bacekjoon_2217;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bacekjoon_2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = -1;
        int max = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);

        while (count < n) {

            answer = arr.get(count) * (n-count);
            if(answer > max) {
                max = answer;
            }
            count++;

        }

        System.out.println(max);

    }

}
