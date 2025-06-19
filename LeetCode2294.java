import java.util.Arrays;

public class LeetCode2294 {

    // Partition Array Such That Maximum Difference Is K
    private static int solution(int[] nums, int k){
        int result = 1;

        Arrays.sort(nums);
        int min = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] - min > k){
                result++;
                min = nums[i];
            }
        }
        
        return result;
    }   

    public static void main(String[] args) {
        int[] arr1 = {3,6,1,2,5};
        int[] arr2 = {2,2,4,5};
        int[] arr3 = {3,1,2};
        
        System.out.println(solution(arr1, 2)); //2
        System.out.println(solution(arr3, 1)); //2
        System.out.println(solution(arr2, 0)); //3
    }
}
