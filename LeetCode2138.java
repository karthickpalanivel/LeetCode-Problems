public class LeetCode2138 {
    private static String[] solution(String s, int k, char fill){
        String[] result = new String[k];
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(char ch : s.toCharArray()){
            if(sb.length() == k){
                if(s.length() - i < k){
                    sb.append(fill);
                } else {
                    result[i] = sb.toString();
                    sb.delete(0, k + 1);
                }
            }
            i++;
                
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcdefghi", 3, 'x'));
    }
}
