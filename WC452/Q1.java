import java.util.*;

public class Q1 {
    private static boolean solution(int[] nums, int target){
        List<Integer> list = new ArrayList<>();

        for(int i : nums)
            list.add(i);
        
        if(list.contains(1)) list.remove(1);

        for(int i = 0; i < nums.length; i++){
            int div = target / nums[i];
            if(list.contains(div)){
                list.remove(nums[i]);
                list.remove(div);
            }
        }

        return list.isEmpty();
    }
    public static void main(String[] args) {
        int[] arr1 = {2,5,3,7};
        int[] arr2 = {3,1,6,8,4};

        System.out.println(solution(arr2, 15));
        System.out.println(solution(arr1, 24));
    }
}
