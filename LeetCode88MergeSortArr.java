import java.util.Arrays;

public class LeetCode88MergeSortArr {
    private static void solution(int[] arrOne, int[] arrTwo, int m, int n){
        int i = m - 1;
        int j = n - 1;
        int k = (m + n) - 1;
        
        while(i >= 0 && j>=0){
            if(arrOne[i] > arrTwo[j]) {
                arrOne[k] = arrOne[i];
                i--;
            } else {
                arrOne[k] = arrTwo[j];
                j--;
            }
            k--;
        }
        
        while(j >= 0){
            arrOne[k] = arrTwo[j];
            k--;
            j--;
        }

        System.out.println(Arrays.toString(arrOne));
    }

    public static void main(String args[]){
        int[] arrOne = {1,2,3,0,0,0};
        int m = 3;
        int[] arrTwo = {2,5,6};
        int n = arrTwo.length;
        solution(arrOne, arrTwo, m, n);
    }
}
