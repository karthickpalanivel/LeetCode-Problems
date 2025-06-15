public class LeetCode2224 {
    private static int solution(String current, String correct){
        int currHour = Integer.parseInt(current.substring(0, 2));
        int currMin = Integer.parseInt(current.substring(3));
        int corrHour = Integer.parseInt(correct.substring(0, 2));
        int corrMin = Integer.parseInt(correct.substring(3));

        int currTotal = currHour * 60 + currMin;
        int corrTotal = corrHour * 60 + corrMin;

        int diff = corrTotal - currTotal;
        int result = 0;

        int[] steps = {60, 15, 5, 1};

        for (int step : steps) {
            result += diff / step;
            diff %= step;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution("04:30", "04:30")); //0
        System.out.println(solution("02:30", "04:30")); //2
        System.out.println(solution("02:30", "04:35")); //3
        System.out.println(solution("11:00", "11:01")); //1
    }
}
