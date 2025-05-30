import java.util.*;

public class LeetCode128 {
    private static int solution(int[] nums){
        int max = 0;

        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) 
            set.add(i);

        for(int num : set){
            int longest = 1;
            int nextNum = num + 1;
            if(!set.contains(num - 1)){
                while(set.contains(nextNum)){
                    longest++;
                    nextNum++;
                }
                max = Math.max(longest, max);
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1,0,1,2};
        int[] arr2 = {100,4,200,1,3,2};
        int[] arr3 = {0,3,7,2,5,8,4,6,0,1};

        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));
    }
}
