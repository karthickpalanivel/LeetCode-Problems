public class LeetCode11 {
    private static int solution(int[] height){
        int result = 0;
        int left = 0, right = height.length - 1;

        while(left < right){
            int minHeight = Math.min(height[left], height[right]);
            result = Math.max(result, minHeight * (right - left));
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,8,6,2,5,4,8,3,7};
        int[] arr2 = {1,1};

        System.out.println(solution(arr1)); //49
        System.out.println(solution(arr2)); //1
    }
}
