import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 2;

        int n = nums.length;
        // Each rotation moves all elements 1 step to the right
        k = k % n; // Handle cases where k >= n
        System.out.println(k);
       
        int p = 1;
        for (int i = 0; i < k; i++) {
            // Store the last element
            int previous = nums[n - 1];
            // Shift all elements right
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
                System.out.println("rotate no: "+ p +" "+Arrays.toString(nums));
                p++;
            }
            // Place the stored element at the first position
            nums[0] = previous;
        }
        System.out.println("final rotation: "+Arrays.toString(nums));
    }
}
