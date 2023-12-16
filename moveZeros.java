
import java.util.*;
public class moveZeros {
    public static void main(String[] args) {
        int[] nums = { 0, 4, 1, 5, 3, 0 }; // {1,3,4,5,0,0}
        int i = 0;
        int[] arr = new int[nums.length];
        int temp = 0;
        while(i < nums.length)
        {
            if (nums[i] != 0) {
                arr[temp] = nums[i];
                temp++;
            }
            i++;
        }
        

        while(temp < nums.length)
        {
            arr[temp] = 0;
            temp++;
        }
        System.out.println(Arrays.toString(arr));
    }    
}
