public class LeetCode643 {
    private static double solution(int[] nums, int k){
        if(nums.length < k){
            int sum = 0;
            for(int i : nums)
                sum += i;
            
            return (double) sum / k;
        }

        int max = 0;
        int sum = 0;
        int i = 0;

        for( ;i < k; i++){
            sum += nums[i];
        }

        max = Math.max(max, sum);

        for( ;i < nums.length; i++){
            sum = sum - nums[i-k] + nums[i];
            max = Math.max(max, sum);
        }

        return (double) max / k;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,12,-5,-6,50,3};
        int[] arr2 = {5};

        System.out.println(solution(arr1, 4)); //12.75000
        System.out.println(solution(arr2, 2)); //2.50000
    }
}
