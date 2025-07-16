import java.util.Arrays;
public class LeetCode821 {
    private static int[] solution(String s, char c){
        s = s.toLowerCase();
        int[] result = new int[s.length()];
        int position = -s.length();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                position = i;
            }
            result[i] = Math.abs(i - position);
        }

        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == c){
                position = i;
            }
            result[i] = Math.min(result[i], position - i);
        }
        
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("loveleetcode", 'e')));
        System.out.println(Arrays.toString(solution("aaab", 'b')));
        System.out.println(Arrays.toString(solution("Karthick", 'k')));
    }    
}