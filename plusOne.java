import java.util.*;
public class plusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();

        int[] nums = {4,3,2,1};
        int temp = nums.length;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp % 10;
            temp /= 10;
        }
        
        s.plusOne(nums);
        for (int i : nums) {
            System.out.print(i+"\t");
        }
        sc.close();
    }
}
class Solution {
    public int[] plusOne(int[] digits) {
        int last = digits.length;
        for (int i = last - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }
        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;
        return newArr;
    }
}

