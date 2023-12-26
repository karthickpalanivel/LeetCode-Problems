import java.util.*;
public class numberToAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(solution(n));
        sc.close();
    }
    
    public static int solution(String n) {
        if (n.length() == 0 || (n.startsWith("0") && n.length()<2)) return 0;
        int s = Integer.parseInt(n);
        double d = (double)(n.length());
        int a = 0, div = (int) (Math.pow(10, d - 1));
        
        while (s != 0) {
            int temp = s;
            if (n.charAt(a + 1) == '0')
                div /= 10;
            
            a++;
        }
    }
}