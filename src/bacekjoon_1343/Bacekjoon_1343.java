package bacekjoon_1343;

import java.util.Scanner;
import java.util.ArrayList;

public class Bacekjoon_1343 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'X') {
                count++;
            }
            else if (str.charAt(i) == '.'){
                while(count > 0){
                    if(count >= 4){
                        result +="AAAA";
                        count -=4;
                    }else if(count >=2){
                        result +="BB";
                        count -=2;
                    }else{
                        System.out.println(-1);
                        return;
                    }
                }
                result+=".";
                count = 0;
            }
            else{
                System.out.println(-1);
                return;
            }
        }
        while(count > 0){
            if(count >= 4){
                result +="AAAA";
                count -=4;
            }else if(count >=2){
                result +="BB";
                count -=2;
            }else{
                System.out.println(-1);
                return;
            }
        }
        System.out.println(result);
    }


    // 최적의 코드
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String result = "";
//
//        result = str.replaceAll("XXXX","AAAA");
//        result = result.replaceAll("XX","BB");
//
//        if(result.contains("X")) {
//            System.out.println(-1);
//            return;
//        }
//
//        System.out.println(result);
//    }
}
