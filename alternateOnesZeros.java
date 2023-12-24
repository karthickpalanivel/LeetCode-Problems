import java.util.*;
public class alternateOnesZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.next()));
        sc.close();
    }

    public static int solution(String s){
        int count = 0;
        StringBuilder s1 = new StringBuilder("0"); //0101
        StringBuilder s2 = new StringBuilder("1"); //1010
        for (int i = 0; i < s.length(); i++) {
            if (s1.charAt(i) == '0') {
                s1.append('1');
            } else {
                s1.append('0');
            }

            if (s2.charAt(i) == '1') {
                s1.append('0');
            } else s2.append('1');
        }
        
        String com = new String();
        if (s.charAt(0) == '1') 
        com = s2.toString();
        else
        com = s1.toString();
        
        com = com.substring(0, s.length());
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != com.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}