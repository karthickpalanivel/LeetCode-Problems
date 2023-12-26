import java.util.*;
public class validAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String str1 = sc.nextLine();
        System.out.print("\nEnter the second word: ");
        String str2 = sc.nextLine();
        if (Anagram(str1, str2)) {
            System.out.println("The two words are anagrams.");
        } else {
            System.out.println("The words are not anagrams.");
        }
        sc.close();
    }
    
    public static boolean Anagram(String str1, String str2) {
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");
        
        if (str1.length() != str2.length()) 
            return false;

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }
}