import java.util.*;
public class onePlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] digits = new int[num];
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            digits[i] = sc.nextInt();

        }

        
        System.out.println(sum); 
        // System.out.println(Arrays.toString(digits));
        sc.close();
    }
}