import java.util.*;

public class occurenceOf25Percent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The number that as occurence of more than 25% is : " + solution(arr));
        sc.close();
    }
    
    public static int solution(int[] arr) {
        int length = arr.length;
        int quarter = arr.length / 4;
        Arrays.sort(arr);
        
        for (int i = 0; i < length - quarter; i++) {
            if (arr[i] == arr[i + quarter])
                return arr[i];
        }
        return -1;
    }
}
