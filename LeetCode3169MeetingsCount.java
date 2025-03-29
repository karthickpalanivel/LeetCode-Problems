import java.util.Arrays;

public class LeetCode3169MeetingsCount {
    private static int solution(int days, int[][] meetings){
        Arrays.sort(meetings, (a,b) -> (a[0] - b[0]));
        int start = 0, end = 0, res = days;

        for(int[] meeting : meetings) {
            System.out.println("res = " + res + " start = " +start + " end = " + end);
            
            if(meeting[0] > end) {
                res -= end - start + 1;
                start = meeting[0];
                end = meeting[1];
            } else {
                end = Math.max(end, meeting[1]);
            }
        }
        res -= end - start;
        return res;
    }

    public static void main(String[] args) {
        int[][] meetingsOne = {{5,7},{1,3},{9,10}};
        int[][] meetingsTwo = {{1,6}};
        int[][] meetingsThree = {{2,4}, {1,3}};
        System.out.println(solution(10, meetingsOne));
        System.out.println(solution(6, meetingsTwo));
        System.out.println(solution(5, meetingsThree));
    }
}