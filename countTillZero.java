import java.util.*;
public class countTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The number of steps till zero is " + solution(num));
        sc.close();
    }

    public static int solution(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
                
            } else {
                num -= 1;
            }
            System.out.println("Step "+ count++ + ": " +num);
        }
        return count;
    }
}