import java.util.*;
import java.io.*;
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};;
        int k;
        int n;
        k = 2;
        n = nums.length;
        if (k > n)
            k %= n;
        
        solution(k, n, nums);
    }

    private static void solution(int k, int n, int[] nums){
        reverseArray(0, n - 1, nums);
        reverseArray(0, k - 1, nums);
        reverseArray(k, n - 1, nums);
        PrintWriter pw = new PrintWriter(System.out, true);
        
        for(int i : nums){
            pw.print(i+" ");
        }
               
    }

    private static int[] reverseArray(int start, int end, int nums[]){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        return nums;
    }
}
