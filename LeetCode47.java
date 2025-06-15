import java.util.ArrayList;
import java.util.List;

public class LeetCode47{
    private static List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> addon = new ArrayList<>();
        boolean[] usedNow = new boolean[nums.length];
        
        solution(nums, addon, usedNow, result);

        return result;
    }

    private static void solution(
        int[] nums, 
        List<Integer> addon, 
       boolean[] usedNow, 
        List<List<Integer>> result){

        if(addon.size() == nums.length){
            result.add(new ArrayList<>(addon));
        }

        for(int i = 0; i < nums.length; i++){
            if(usedNow[i]) continue;

            usedNow[nums[i]] = true;
            addon.add(nums[i]);
            solution(nums, addon, usedNow, result);
            addon.remove(addon.size() - 1);   
        }

    }
    public static void main(String[] args) {
        int[] arrOne = {1,2,1};
        int[] arrTwo = {1,2,3};

        System.out.println(permuteUnique(arrOne));
        System.out.println(permuteUnique(arrTwo));
    }
}