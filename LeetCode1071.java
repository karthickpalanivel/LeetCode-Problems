import java.util.*;
public class LeetCode1071 {
    private static String solution(String word1, String word2){
        if(!word1.concat(word2).equals(word2.concat(word1)))
            return "";
        
        int len1 = word1.length();
        int len2 = word2.length();

        int mod = gcd(len1, len2);
        return word1.substring(0, mod);
    }


    private static int gcd(int len1, int len2){
        System.out.println(len1);
        return len2 == 0 ? len1 : gcd(len2, len1 % len2);
    }


    public static void main(String[] args) {
        System.out.println(solution("ABCABC", "ABC"));
        System.out.println(solution("LEET", "CODE"));
        System.out.println(solution("ABABAB", "ABAB"));
    }
}
