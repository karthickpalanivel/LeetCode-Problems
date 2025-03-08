import java.util.*;
public class LeetCode1679maxOperation {
    private static int solution(int[] nums, int k){
        int count = 0;
        List<int[]> arr = Arrays.asList(nums);
        int i =0;
        while(!arr.isEmpty() || i < nums.length){
            int key = nums[i] -  k;
            if(arr.contains(nums[i]) && arr.contains(key)){
                arr.remove(nums[i]);
                arr.remove(key);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,1,3,4,3};

        System.out.println(solution(arr1, 5));
        System.out.println(solution(arr2, 6));
    }
}