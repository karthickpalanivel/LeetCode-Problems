import java.util.*;

public class LeetCode1431kidsWithCandies {
    private static List<Boolean> solution(int[] candies, int k){
        List<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int n = candies.length;
        
        for(int i = 0; i < n; i++)
            max = Math.max(max, candies[i]);

        for(int i = 0; i < n; i++){
            if(candies[i] + k >= max)
                result.add(true);
            else 
                result.add(false);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {2,3,5,1,3};
        int[] arr2 = {4,2,1,1,2};
        int[] arr3 = {12, 1, 12};

        System.out.println(solution(arr1, 3));
        System.out.println(solution(arr2, 1));
        System.out.println(solution(arr3, 1));

    }    
}
