public class LeetCode125ValidPalindrome {
    private static boolean solution(String s){
        if(s == null || s.length() < 1) return false;
        s = s.toLowerCase();        
        int left = 0, right = s.length() - 1;
        String alphaNumeric = "0123456789abcdefghijklmnopqrstuvwxyz";

        while(left < right){
            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);

            if(alphaNumeric.indexOf(ch1) == -1){
                left++;
                continue;
            } 

            if(alphaNumeric.indexOf(ch2) == -1){
                right--;
                continue;
            }

            if(ch1 != ch2) return false;

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution("A man, a plan, a canal: Panama"));
        System.out.println(solution("race a car"));
        System.out.println(solution("nullun"));
        System.out.println(solution(null));
    }
}
