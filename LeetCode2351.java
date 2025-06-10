import java.util.*;

public class LeetCode2351 {
    private static char solution(String s){
        List<Character> list = new ArrayList<>();
        for(char ch : s.toCharArray())
            if(list.contains(ch)) return ch;
            else list.add(ch);
        return '-';
    }
    public static void main(String[] args) {
        System.out.println(solution("abccbaacz")); //c
        System.out.println(solution("abcdd")); //d
        System.out.println(solution("abcbd")); //b


    }
}
