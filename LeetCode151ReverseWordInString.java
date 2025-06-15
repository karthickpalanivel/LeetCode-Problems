import java.util.*;

public class LeetCode151ReverseWordInString {
    public static void main(String[] args) {

        System.out.println(solution("the sky is blue"));
        System.out.println(solution("  hello world  "));
        System.out.println(solution("a good     example"));
        
        

    }

    private static String solution(String s){
        String result = "";
        String[] temp = s.split("\\s+");
        //using \\s+ removes all the whitespace and only add the characters that are separated by whitespaces.
        //using \\s will remove separate non-whitespace characters with one whitespace.

        for(int i = temp.length - 1; i >= 0; i--)
            result += temp[i] + " ";            
        
        return result.trim();
    }
}
