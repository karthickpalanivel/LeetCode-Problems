import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmallestNumFromTwoDigitArray {
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 1, 4};
        int[] arr2 = {3,7, 8};

        System.out.println(solution(arr1, arr2));
    }

    private static int solution(int[] num1, int[] num2){
        Arrays.sort(num1);
        Arrays.sort(num2);

        Set<Integer> set = new HashSet<>();
        
        for(int i : num1) {
            set.add(i);
        }
        
        for(int n : num2){
            if(set.contains(n))
            return n;
        }
        return num1[0] < num2[0] ? (num1[0] * 10) + num2[0] : (num2[0] * 10) + num1[0];   
    }
}
