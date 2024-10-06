import java.util.*;
public class pascalTrinagle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                list.add(i);
                // list(i) = i + (i + 1);        
            }
        }
        sc.close();
    }
}
