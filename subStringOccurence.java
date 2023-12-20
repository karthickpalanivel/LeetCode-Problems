import java.util.*;
public class subStringOccurence {
    public static void main(String[] args) {
        
        
    }

    public static boolean solution(String str) {
        int n = str.length();
        str = str.toLowerCase();
        
        if (n == 0 || n == 1) {
            return false;
        }

        HashSet<Character> set = new HashSet<Character>();
        char[] ch = str.toCharArray();
        

        for (int i = 0; i < n; i++) {
            set.add(ch[i]);
        }

        char[] ch1 = new char[set.size()];

        for (char i : set) {
            ch1[i] = i;
        }

        String subString = new String(ch1);

        System.out.print(subString);
        if (str.contains(subString + subString)) {
            return true;
        } else {
            return false;
        }
    }
}