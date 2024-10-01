import java.util.*;

public class laserBeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] beam = new String[n];
        for (int i = 0; i < n; i++) {
            beam[i] = sc.nextLine();
        }

        System.out.println(solution(beam));
        sc.close();
    }
    
    public static int solution(String[] beam) {
        
        int a = 0, r1 = 0, r2 = 0;
        for (int i = 0; i < beam[0].length(); i++) {
            if (beam[0].charAt(i) == '1') {
                a++;
            }
        }

        int result = 0;
        r1 = a;
        
        for (int j = 1; j < beam.length; j++) {
            
            char[] ch = beam[j].toCharArray();
            r2 = 0;
            
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '1') {
                    r2++;
                }
            }

            if (r1 != 0) {
                result+= r1 * r2;
            }
            r1 = r2;
        }
        
        return result;
    }
}
