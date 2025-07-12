import java.util.Map;
import java.util.HashMap;


public class LeetCode594 {
    private static int solution(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0; 
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()){
            if(map.containsKey(key + 1)){
                result = Math.max(result, map.get(key) + map.get(key + 1));
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arrOne = {1,3,2,2,5,2,3,7};
        int[] arrTwo = {1,2,3,4};
        int[] arrThree = {1,1,1,1};

        System.out.println(solution(arrOne));
        System.out.println(solution(arrTwo));
        System.out.println(solution(arrThree));
    }
}
