

public class BasicCalculator { 
    public static void main(String[] args) {
        String str = "2 + 2";
        String str2 = "(1+(4+5+2)-3)+(6+8)";
        
        System.out.println("2 + 2 = " + solution(str));
        System.out.println("(1+(4+5+2)-3)+(6+8) : " + solution(str2));
    }

    private static int solution(String str) {
        str = str.replaceAll(" ", "");
        
        return -1;
    }
}
