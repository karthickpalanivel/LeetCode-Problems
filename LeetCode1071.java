public class LeetCode1071 {
    private static String solution(String word1, String word2){
        String w1 = word1;
        String w2 = word2;

        int len = w1.length() <= w2.length() ? w1.length() : w2.length();
        String wo = w1.length() >= w2.length() ? w1 : w2;
        String wr = wo.equals(word1) ? word2 : word1;
        for(int i = 0; i < len;i++){
            if(wo.substring(i, len - 1 + i).equals(wr)){
                return wr;
            }
        }

        return "";
    }   

    public static void main(String[] args) {
        System.out.println(solution("ABCABC", "ABC"));
        System.out.println(solution("LEET", "CODE"));
        System.out.println(solution("ABABABAB", "AB"));
    }
}
