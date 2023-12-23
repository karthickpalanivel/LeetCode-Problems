import java.util.*;
public class largestGoodInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(solution(n));
        sc.close();
    }

    public static String solution(String num) {
        int result = -1;
        String numbers = "";
        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2) && num.charAt(i) > result) {
                result = num.charAt(i);
                numbers = num.substring(i, i + 3);
            }
        }
        return numbers;
    }
}

/*
         * There are three methods we can use to convert a integer to string
         * 1. String.valueOf(integerVariable);
         * 2. Integer.toString(integerVariable);
         * 3. Integer(int).toString();
*/