import java.util.HashMap;
import java.util.Map;

public class LeetCode80RemoveDuplicateII {  
    private static int solution(int[] nums){
        if(nums.length == 1) return 1;
        int count = 0;
        Map<Integer, Integer> hmap = new HashMap<>();
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            int a = nums[i];
            
            if(hmap.containsKey(k) && hmap.get(k) < 2){
                nums[k] = nums[i];
                hmap.put(hmap.get(a), hmap.getOrDefault(a, 0) + 1);
                count++;
            } else {
                hmap.put(a, 0);
            }
        }

        System.out.print("[");
        for(int i = 0; i < count; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.print("]");

        return count;
    }   
    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,3};
        int[] arr2 = {0,0,1,1,1,1,2,3,3};

        System.out.println(solution(arr2));
        System.out.println(solution(arr));
        
    } 
}
