import java.util.*;

public class LeetCode345{
    private static String solution(String s){
        char[] words = s.toCharArray();
        String vowels = "AEIOUaeiou";
        int begin = 0, end = s.length() - 1;

        while(begin < end){
            while(begin < end && vowels.indexOf(words[begin]) == -1)
                begin++;
            
            while(begin < end && vowels.indexOf(words[end]) == -1)
                end--;
            
            char temp = words[begin];
            words[begin] = words[end];
            words[end] = temp;
            
            begin++;
            end--;
        }
        return new String(words);
    }

    public static void main(String[] args) {
        System.out.println(solution("IceCreAm"));
        System.out.println(solution("leetcode"));
    }
}