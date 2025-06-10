import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode56MergeIntervals {
    public static int[][] solution(int[][] intervals){
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> mergeInterval = new ArrayList<>();
        int[] prev = intervals[0];
        
        for(int i = 0; i < intervals.length; i++){
            int[] curr = intervals[i];
            if(curr[0] <= prev[1])
                prev[1] = Math.max(curr[1], prev[1]);
            
            else {
                mergeInterval.add(prev);
                prev = curr;
            }
        }

        mergeInterval.add(prev);
       
        return mergeInterval.toArray(new int[mergeInterval.size()][]);
    }       
    
    public static void main(String[] args) {
        int[][] arrOne = {{1,4},{4,5}};
        int[][] arrTwo = {{1,3},{2,6},{8,10},{15,18}};
        
        System.out.println(Arrays.deepToString(solution(arrTwo)));
        System.out.println(Arrays.deepToString(solution(arrOne)));
    }
}