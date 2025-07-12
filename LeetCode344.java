import java.util.Arrays;

public class LeetCode344 {
    private static void solution(char[] s){
        int len = s.length;
        if(len == 0) return;

        int left = 0, right = len - 1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(s));
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        char[] s2 = {'H','a','n','n','a','h'};

        solution(s);
        solution(s2);
    }    
}
