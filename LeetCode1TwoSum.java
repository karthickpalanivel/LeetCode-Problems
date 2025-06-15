import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1TwoSum {

    private static int[] solution(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(map.containsKey(target - num)){
                return new int[]{i, map.get(target - num)};
            }
            map.put(num, i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] arr1 = {3,2,4};

  

        System.out.println(Arrays.toString(solution(arr1, 9)));
        System.out.println(Arrays.toString(solution(arr, 6)));
    }
}
