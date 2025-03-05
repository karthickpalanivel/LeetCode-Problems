import java.util.*;
//Error in this program
public class KadaneAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        solution(arr);
        sc.close();
    }

    private static int[] solution(int[] nums){
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int arrStart = 0;
        int arrEnd = 0;
        int greatest = 0;
        for(int i = 0; i<nums.length; i++){
            
            if(sum > greatest){
                greatest = sum;
            }
            
            if (sum == 0){
                start = i;
            }
            
            sum += nums[i];
            
            if(sum > maxValue){
                maxValue = sum;
                arrStart = start;
                arrEnd = i;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        int diffLength = arrEnd - arrStart;
        int[] newArr = new int[diffLength];
        for(int i = arrStart; i<=arrEnd; i++){
            newArr[i-arrStart] = nums[i];
        }
        
        System.out.println("The Maximum sum of Sub Array is : " + greatest);
        return newArr;
    }
}
