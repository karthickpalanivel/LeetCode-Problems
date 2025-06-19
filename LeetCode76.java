import java.util.HashMap;
import java.util.Map;

public class LeetCode76 {
    private static String solution(String s, String t){
        if(s == null || t == null || s.length() < 1 || t.length() < 1) return "";

        int m = s.length();
        int n = t.length();
        
        if(m < n) return "Edge Case failed";

        Map<Character, Integer> mapOne = new HashMap<>();
        Map<Character, Integer> mapTwo = new HashMap<>();
    
        for(char ch : t.toCharArray()){
            mapTwo.put(ch, mapTwo.getOrDefault(ch, 0) + 1);
        }

        int requiredSize = mapTwo.size();
        int left = 0, minLeft = 0, minLen = Integer.MAX_VALUE;
        int have = 0;
    
        for(int right = 0; right < m; right++){
            char ch = s.charAt(right);
            mapOne.put(ch, mapOne.getOrDefault(ch, 0) + 1);

            if(mapTwo.containsKey(ch) && 
                mapOne.get(ch) == mapTwo.get(ch)){
                have++;
            }

            while(have == requiredSize){
                if((right - left + 1) < minLen){
                    minLen = right - left + 1;
                    minLeft = left;
                }

                char leftChar = s.charAt(left);
                mapOne.put(leftChar, mapOne.get(leftChar) - 1);
                if(mapTwo.containsKey(leftChar) && mapOne.getOrDefault(leftChar, 0) < mapTwo.get(leftChar)){
                    have--;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLen + minLeft);
    }

    public static void main(String[] args) {
        System.out.println(solution("ADOBECODEBANC", "ABC")); //BANC
        System.out.println(solution("a", "a")); //a 
        System.out.println(solution("a", "aa")); //""

    }
}
