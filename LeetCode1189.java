import java.util.HashMap;
import java.util.Map;

public class LeetCode1189 {
    private static int solution(String s){
        String balloon = "balloon";
        Map<Character, Integer> map = new HashMap<>();
        
        for(char ch: s.toCharArray()){
            if(balloon.indexOf(ch) != -1)
                map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        if(
            !map.containsKey('b') ||
            !map.containsKey('a') ||
            !map.containsKey('l') || 
            !map.containsKey('o') ||
            !map.containsKey('n')
        ){
            return 0;
        } else {
            return Math.min(
                Math.min(map.get('b'), map.get('a')), 
                                Math.min(map.get('l') / 2, 
                                Math.min(map.get('o') / 2, map.get('n'))));
        }
    }
    
    public static void main(String[] args) {
        System.out.println(solution("leetcode"));
        System.out.println(solution("nlaebolko"));
        System.out.println(solution("loonbalxballpoon"));
    }
}
