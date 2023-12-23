import java.util.*;
public class longestPrefixString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        System.out.println(solution(strs));
        sc.close();
    }

    public static String solution(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        
        Arrays.sort(strs);
        
        int length = 0;
        int lastWord = strs.length - 1;

        if (strs[0].length() < strs[lastWord].length()) {
            length = strs[0].length();
        } else {
            length = strs[lastWord].length();
        }

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < length; i++) {
            if (strs[0].charAt(i) == strs[lastWord].charAt(i)) {
                sb.append(strs[0].charAt(i));
            } else {
                break;
            }
        }

        return sb.toString();
    }
}
