import java.util.Stack;

public class LeetCode844BackSpaceString {
    private static boolean solution(String s, String t){
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(ch >= 'a' && ch <= 'z') s1.push(ch);
            else if(!s1.isEmpty() && ch == '#') s1.pop();
        }

        for(char ch : t.toCharArray()){
            if(ch >= 'a' && ch <= 'z') s2.push(ch);
            else if(!s2.isEmpty() && ch == '#') s2.pop();
        }

        return s1.equals(s2);
    }

    public static void main(String[] args) {
       System.out.println(solution("y#fo##f", "y#f#o##f")); //true
       System.out.println(solution("ab#c","ad#c")); //true
       System.out.println(solution("ab##","c#d#")); // true
       System.out.println(solution("a#c","b")); //false
    }
}
