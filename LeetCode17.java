import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode17 {
    private static List<String> solution(String digits){
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0) return result;

        Map<Character, String> map = Map.of(
            '2', "abc", 
            '3', "def", 
            '4', "ghi", 
            '5', "jkl", 
            '6', "mno", 
            '7', "pqrs", 
            '8', "tuv", 
            '9', "wxyz" 
        );
        
        backtracking(0, new StringBuilder(), digits, result, map);

        return result;
    }

    private static void backtracking(int index, StringBuilder combinations, String digits, List<String> result, Map<Character, String> map){
        if(index == digits.length()){
            result.add(combinations.toString());
            return;
        }        

        String letters = map.get(digits.charAt(index));
        for(char letter : letters.toCharArray()){
            combinations.append(letter);
            backtracking(index + 1, combinations, digits, result, map);
            combinations.deleteCharAt(combinations.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("23"));
        System.out.println(solution("2"));
        // System.out.println(solution(""));
    }    
}
