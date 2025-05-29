import java.util.Arrays;

public class LeetCode628 {
    private static int solution(int[] nums){
        int len = nums.length;
        int one = nums[0], two = nums[1], three = nums[2];
        int result = one * two * three;
        int temp = result;
        Arrays.sort(nums);
        
        for(int i = 3; i < len; i++){
            if(((temp / nums[i - 1]) * nums[i] > result)){
                result = (temp / nums[i - 1]) * nums[i];
            }

            else if(((temp / nums[i - 2]) * nums[i] > result)){
                result = (temp / nums[i - 2]) * nums[i];
            } 
            
            else if(((temp / nums[i - 3]) * nums[i] > result)){
                result = (temp / nums[i - 3]) * nums[i];
            } 
        }

        return result;
    }    
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2 = {1,2,3,4};
        int[] arr3 = {};
        System.out.println(solution(arr));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));

    }
}


/*
 [1,2,3]
[1,2,3,4]
[-1,-2,-3]
 */