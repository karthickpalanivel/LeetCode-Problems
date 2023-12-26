import java.util.*;
public class primeDivFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        ArrayList<Integer> sep = new ArrayList<Integer>();
        ArrayList<Integer> notDivFour = new ArrayList<Integer>();

        for (int i = 1; i <= num; i++) {
            if (prime(i)) {
                primeNumbers.add(i);
            }
        }
        
        for (int i : primeNumbers) {
            sep.add(digit(i));
        }

        for (int i : sep) {
            if (rishi(i) != -1) {
                notDivFour.add(i);
            }
        }

        System.out.println("The final output \n");

        for (int i : notDivFour) {
            System.out.print(i + "\t");
        }

        sc.close();
    }
    
    public static boolean prime(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int digit(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
    
    public static int rishi(int num) {
        if (num % 4 == 0) {
            return -1;
        } else {
            return num;
        }
    }
}