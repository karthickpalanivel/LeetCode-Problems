import java.util.*;
public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("\nEnter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        removeDuplicateElements(arr);
        sc.close();
    }
    
    public static void removeDuplicateElements(int[] arr) {
        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i])
                arr[j++] = arr[i];
        }
        System.out.println("\nThe unique elements are:\t");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
