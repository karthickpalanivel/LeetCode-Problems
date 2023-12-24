import java.util.*;
public class alternateOnesZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.next()));
        sc.close();
    }

    public static int solution(String s){
        int n = s.length();
        if (n < 2)
            return 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0' && i % 2 == 0)
                count++;
            else if (s.charAt(i) == '1' && i % 2 == 1)
                count++;
        }
        return Math.min(count, n - count);
    }
}