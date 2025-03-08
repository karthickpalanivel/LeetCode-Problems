public class LeetCode1768MergeStrings {
    
    private static String solution(String word1, String word2){
        StringBuilder sb = new StringBuilder();
        int len = word1.length() <= word2.length() ? word1.length() : word2.length();
        String word = word1.length() > word2.length() ? word1 : word2;

        for(int i = 0; i < len; i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        
        if(word.length() > 0){
            sb.append(word.substring(len));
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(solution("abc", "pqr"));
        System.out.println(solution("ab", "pqrs"));
        System.out.println(solution("abcd", "pq"));
    }
}
