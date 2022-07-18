package greedy.bacekjoon_21314;

import java.util.*;

public class Bacekjoon_21314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String min = "";
        String max = "";
        char[] tmp = str.toCharArray();
        int count = 0;
        for(int i =0; i<str.length(); i++){
            if(tmp[i] == 'M'){
                count ++;
                if(i == str.length()-1){
                    min+="1";
                    for(int j =0; j<count; j++){
                        max+="1";
                        if(j!=count-1)
                            min+="0";
                    }
                }
            }else{
                max+="5";
                if(count !=0)
                    min+="1";
                for(int j = 0;j<count;j++){
                    max+="0";
                    if(j!= count-1)
                        min+="0";
                }
                min+="5";

                count = 0;
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
