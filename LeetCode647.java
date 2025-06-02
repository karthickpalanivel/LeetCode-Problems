public class LeetCode647 {
    private static int solution(String s){
        if(s == null || s.length() < 1) return 0;

        int result = 0;
        int left = 0, right = 1;

        while(left < right) {
            String subs = s.substring(left, right);

            if(isPalindrome(subs)) 
            result++;

            if(right < s.length()){
                right++;
            } else {
                left++;
            }
        }

        return result;
    }

    //isPalindrome function
    private static boolean isPalindrome(String subs){
        int left = 0, right = subs.length() - 1;
        while(left < right){
            if(subs.charAt(left) != subs.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution("abc")); //3
        System.out.println(solution("aaa")); //6
    }
}

/*
add every character as substring -> increment result value

cut the substring using in-built -> send to verify isPalindrome function, if true again increment result value

finally return result
*/
