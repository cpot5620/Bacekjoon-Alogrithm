package greedy.baekjoon_1541;
import java.util.*;

public class Baekjoon_1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] substraction  =  str.split("\\-");
        int answer = 0;
        int sum;
        for(int i= 0; i<substraction.length; i++){
            sum = 0;
            String[] addition = substraction[i].split("\\+");

            for(int j = 0; j< addition.length; j++){
                sum+=Integer.parseInt(addition[j]);
            }

            if(i == 0)
                answer = sum;
            else
                answer -= sum;
        }

        System.out.println(answer);

    }
}
