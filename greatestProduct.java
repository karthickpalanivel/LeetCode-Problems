import java.util.*;
public class greatestProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(solution(nums));

        sc.close();
    }
    
    public static int solution(int[] nums) {
        int greatest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; i < nums.length; i++) {
                if (nums[i] * nums[j] > greatest) 
                    greatest = nums[i] * nums[j];
                
            }
        }
        return greatest;
    }
}
