public class LeetCode152 {
    private static int solution(int[] nums){
        int max = Integer.MIN_VALUE;
        int left = 0;
        int num = 1 * nums[left];
        for(int right = 1; right < nums.length; right++){
            int temp = num * nums[right];
            if(temp > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(temp < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            max = Math.max(temp, max);
            
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,-2,4};
        int[] arr2 = {-2,0,-1};

        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }
}
