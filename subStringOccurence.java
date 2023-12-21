import java.util.*;
public class subStringOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(solution(word));
        sc.close();
    }

    public static boolean solution(String str) {
        String dou = str + str;
        String sub = dou.substring(1, dou.length() - 1);
        return sub.contains(str);
    }
}