import java.util.*;
public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println("The length of the last word in the String: " + getLength(word));

        sc.close();
    }
    
    public static int getLength(String str) {
        String[] words = str.split("\\s+");
        int lastWord = words.length - 1;
        String subString = words[lastWord];
        return subString.length();

    }
}
