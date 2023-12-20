import java.util.*;
public class reverseExisting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght of the array: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the Elements of the array: ");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("The distinct Elements are: " + solution(num));
        sc.close();
    }

    public static int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : nums) {
            set.add(i);
            set.add(reverse(i));
        }
        return set.size();
    }
    
    public static int reverse(int i) {
        long sum = 0;
        while (i != 0) {
            sum = (sum * 10) + (i % 10);
            i /= 10;
        }
        if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) (sum);
    }
}