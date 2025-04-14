import java.util.Arrays;

public class LeetCode2697LexicographicallySmallestPalindrome {
    private static String solution(String s){
        int n = s.length();
        char[] chArr = s.toCharArray();

        for(int i = 0; i < n / 2; i++){
            if(chArr[i] != chArr[n - 1 - i]){
                if(chArr[i] < chArr[n - 1 - i]){
                    chArr[n - 1 - i] = chArr[i];
                } else {
                    chArr[i] = chArr[n - 1 - i];
                }
            }
        }
        s = String.copyValueOf(chArr);
        return s;
    } 
/*
copyValueOf()
ValueOf()

*/
    public static void main(String[] args) {
        System.out.println(solution("egcfe"));
        System.out.println(solution("abcd"));
        System.out.println(solution("seven"));
    }
}
