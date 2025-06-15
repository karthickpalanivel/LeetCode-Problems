public class LeetCode1143 {
    private static int solution(String s1, String s2){
       int[] dp = new int[s1.length()];
       int longest = 0; 

       for(char ch : s2.toCharArray()){
            int curLength = 0; 
            for(int i = 0; i < dp.length; i ++){
                if(curLength < dp[i]) curLength = dp[i];
            
                else if(ch == s1.charAt(i)){
                    dp[i] = curLength + 1;
                    longest = Math.max(longest, curLength + 1);
                }
           }
        }

       return longest;
    }
    public static void main(String[] args) {
        System.out.println(solution("abcde", "ace"));
        System.out.println(solution("abc", "abc"));
        System.out.println(solution("abc", "def"));
        System.out.println(solution("abcd", "dbca"));


    }
}
