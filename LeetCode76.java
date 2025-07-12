import java.util.HashMap;
import java.util.Map;

public class LeetCode76 {
    private static String solution(String s, String t){
        if(s == null || t == null || s.length() < 1 || t.length() < 1) return "";

        Map<Character, Integer> charCountMap = new HashMap<>();

        for(char ch : t.toCharArray()){
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        int requiredCount = charCountMap.size();
        int left = 0, right = 0, formedCount = 0;

        Map<Character, Integer> windowCountMap = new HashMap<>();
        int[] ans = {-1, 0, 0}; // length, left, right


        while(right < s.length()){
            char ch = s.charAt(right);
            windowCountMap.put(ch, windowCountMap.getOrDefault(ch, 0) + 1);

            if(charCountMap.containsKey(ch) && windowCountMap.get(ch) == charCountMap.get(ch).intValue()){
                formedCount++;
            }

            while(left <= right && formedCount == requiredCount){
                ch = s.charAt(left);

                if(ans[0] == -1 || right - left + 1 < ans[0]){
                    ans[0] = right - left + 1;
                    ans[1] = left;
                    ans[2] = right;
                }

                windowCountMap.put(ch, windowCountMap.get(ch) - 1);
                if(charCountMap.containsKey(ch) && windowCountMap.get(ch).intValue() < charCountMap.get(ch).intValue()){
                    formedCount--;
                }

                left++;
            }
            right++;
        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }

    public static void main(String[] args) {
        System.out.println(solution("ADOBECODEBANC", "ABC")); //BANC
        System.out.println(solution("a", "a")); //a 
        System.out.println(solution("a", "aa")); //""

    }
}
