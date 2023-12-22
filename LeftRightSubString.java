import java.util.*;
public class LeftRightSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
        sc.close();
    }

    public static int solution(String str) {
        if (str.length() == 0 || str.length() < 2)
            return -1;

        int count, result = 0;
        for (int i = 0; i < str.length()-1; i++) {
            count = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(j) == '0') {
                    count++;
                }
            }
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == '1') {
                    count++;
                }
            }
            result = Math.max(result, count);
        }
        return result;
    }
}
