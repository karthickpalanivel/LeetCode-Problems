import java.util.*;
class validPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        if (solution(word))
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is not a palindrome");
        
        sc.close();
    }

    public static boolean solution(String word) {
        
        char[] ch = word.toCharArray();
        char[] result = new char[ch.length];

        for (int i = 0; i < ch.length; i++) {
            result[ch.length - 1 - i] = ch[i];
        }
        
        return Arrays.equals(result, ch);
    }
}