package bacekjoon_16953;

import java.util.*;

public class Bacekjoon_16953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int answer = 0;

        while(a!=b){
            if(a>b){
                System.out.println(-1);
                return;
            }

            if(b % 2 == 0){
                b = b / 2;
                answer++;
            }else if(b % 10 == 1){
                b= (b-1) / 10;
                answer++;
            }
            else{
                System.out.println(-1);
                return;
            }
        }

        System.out.println(answer+1);
    }
}
