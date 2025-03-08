public class LeetCode238SelfProduct {
    private static void solution(int[] nums){
        int[] arr = nums;
        int n = nums.length;
        int left = 1;
        int right = 1;


        for(int i = 0; i < n; i++){
            arr[i] = left;
            left *= nums[i];
        }

        for(int i = n-1; i >= 0; i--){
            arr[i] *= right;
            right *= nums[i];
        }
        System.out.println(arr.toString());
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {-1,1,0,-3,3};
        solution(arr1);
        solution(arr2);

    }
}
