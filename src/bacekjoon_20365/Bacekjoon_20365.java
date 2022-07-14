package bacekjoon_20365;
import java.util.*;
public class Bacekjoon_20365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String.split으로 구현하게 되면, 연속적으로 존재할 경우 공백 문자가 들어가서 그룹 개수를 정확하게 파악할 수 없음.

        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int answer;
        StringTokenizer st = new StringTokenizer(str,"B");
        int count_red = 0;
        int count_blue = 0;
        while(st.hasMoreTokens()){
            count_red++;
            st.nextToken();
        }

        st = new StringTokenizer(str,"R");
        while(st.hasMoreTokens()){
            count_blue++;
            st.nextToken();
        }
        System.out.println(count_red < count_blue ? count_red +1 : count_blue +1);
    }
}
