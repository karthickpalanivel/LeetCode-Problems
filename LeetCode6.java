public class LeetCode6 {
    private static String solution(String word, int numRow){
        if(word == null || word.length() <= numRow || word.length() <= 1 || numRow <= 1) return word;

        StringBuilder[] sbArr = new StringBuilder[numRow];

        for(int i = 0; i < numRow; i++) {
            sbArr[i] = new StringBuilder();
        }

        int curr = 0, index = 0, step = 1;
        
        while(index < word.length()){
            sbArr[curr].append(word.charAt(index++));

            if(curr == 0) {
                step = 1;
            }
            
            else if(curr == numRow - 1) {
                step = -1;
            }

            curr += step;
        }

        StringBuilder result = new StringBuilder();
        for(StringBuilder row : sbArr){
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("PAYPALISHIRING", 3));
        solution("PAYPALISHIRING", 4);
        solution("NG", 3);
        solution("A", 1);
    }
}
