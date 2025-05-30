public class LeetCode5 {
    private static String brutefroce(String s){
        if (s.equals("") || s.equals(null)) return "Note: It's Null";

        String result = "";
        s = s.toLowerCase();
        int len = s.length();
        int maxlen = 0;

        for(int i = 0; i < len; i++){

            for(int j = i; j < len; j++){
            
                String sub = s.substring(i, j + 1);
            
                if(isPalindrome(sub) && sub.length() > maxlen){
                    result = sub;
                    maxlen = sub.length();
                }
            }
        }
        return result;
    }   


    private static boolean isPalindrome(String sub){
        int left = 0, right = sub.length() - 1;
        while(left < right){
            if(sub.charAt(left++) != sub.charAt(right--))
                return false;
        }
        return true;
    }


    private static String solution(String s){
        if(s.length() < 1 || s == null) return "";
        s = s.toLowerCase();
        int start = 0, end = 0;
        
        for(int i = 0; i < s.length(); i++){
            int oddLen = expandFromCenter(s, i, i);
            int evenLen = expandFromCenter(s, i, i + 1);
            int max = Math.max(oddLen, evenLen);

            if (max > end - start) {
                start = i - (max - 1) / 2;
                end = i + max / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandFromCenter(String s, int left, int right){

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return right - left - 1;
    }
    
    public static void main(String[] args) {
        System.out.println(solution("ababd"));
        System.out.println(solution(""));
        System.out.println(solution("cBbd"));
        System.out.println(solution("karTHTrak"));

    }
}
