import java.util.ArrayList;
import java.util.List;

public class LeetCode46Permutation {
    private static List<List<Integer>> solution(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtracking(result, sol, used, nums);
        System.out.println();

        return result;
    }

    private static void backtracking(List<List<Integer>> result, List<Integer> sol, boolean[] used, int[] nums){
        if(sol.size() == nums.length){
            result.add(new ArrayList<>(sol));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;

            sol.add(nums[i]);
            used[i] = true;
            backtracking(result, sol, used, nums);
            sol.remove(sol.size() - 1);
            used[i] = false;
        }
    }


    public static void main(String[] args) {
        int[] arrOne = {1,2,3};
        int[] arrTwo = {1,2};
        int[] arrThree = {1,2,3,4};

        System.out.println(solution(arrOne));
        System.out.println(solution(arrTwo));
        System.out.println(solution(arrThree));

    }
}
