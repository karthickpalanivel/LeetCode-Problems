import java.util.*;

public class LeetCode3LongestSubString {
    private static int solution(String s){
        Set<Character> set = new HashSet<>();        
        int left = 0; 
        int right = 0;
        int max = 0;
        int n = s.length();

        while(right < n){
            
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                max = Math.max(max, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcabcbb")); //3
        System.out.println(solution("bbbbb")); //1
        System.out.println(solution("pwwkew")); //3
        System.out.println(solution("null")); //3
    }

}
