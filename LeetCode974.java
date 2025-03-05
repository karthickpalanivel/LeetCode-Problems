import java.util.*;
public class LeetCode974 {
    public static void main(String[] args) {
        int[] num1 = {4,5,0,-2,-3,1};
        int[] num2 = {5};
        System.out.println(subarraysDivByK(num2, 9));
        System.out.println(subarraysDivByK(num1, 5));
    }   
    
    private static int subarraysDivByK(int[] nums, int k){
        int count = 0; 
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0; 

        map.put(0, 1);

        for(int num : nums){
            sum += num;
            int mod = sum % k;

            if(mod < 0)
                mod += k;
            
            if(map.containsKey(mod)){

                count += map.get(mod);
                map.put(mod, map.get(mod) + 1);
            
            } else 
                map.put(mod, 0);
            
        }

        return count; 
    } 
}
