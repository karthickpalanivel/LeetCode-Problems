import java.util.Map;
import java.util.HashMap;

public class Q2 {
    private static String encode(String s){
        if(s == null || s.length() == 0) return "";
        StringBuilder result = new StringBuilder();
        int count = 1;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                count++;
            } else {
                result.append(s.charAt(i)).append(count);
                count = 1;
            }
        }
        result.append(s.charAt(s.length() - 1)).append(count);
        return result.toString();
    }   
    
    public static void main(String[] args) {
        System.out.println(encode("aaAabbbbcccc"));
        System.out.println(encode("null"));
        System.out.println(encode("abcdefghijklmnopqrstuvwxyz"));
    }
}
