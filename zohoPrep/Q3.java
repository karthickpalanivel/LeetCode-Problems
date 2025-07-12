import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;
public class Q3 {
    private static void solution(int[] arrOne, int[] arrTwo){
        Set<Integer> set = new TreeSet<>();
        for(int i : arrOne) set.add(i);
        for(int i : arrTwo) set.add(i);
        
        int[] arr = new int[set.size()];
        int j = 0; 
        for(int i : set) arr[j++] = i;

        System.out.println(set);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arrOne = {1,3,5,7};
        int[] arrTwo = {3,5,7,2,9,0};
        solution(arrOne, arrTwo);
    }
}