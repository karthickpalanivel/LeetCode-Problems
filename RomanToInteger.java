import java.util.*;
public class RomanToInteger{
    public static void main(String[] args) {
        System.out.println(romanToInt("V")); 
    }

    private static int romanToInt(String s){

        int sum = 0;

        Map<Character, Integer> romanValues = new HashMap<>();

        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);


        int len = s.length();
        int i = 0;
        while(i < len){
            if(i < len - 1 && romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i+1))){
                sum += (romanValues.get(s.charAt(i+1)) - romanValues.get(s.charAt(i)));
                i += 2;
            } else {
                sum += romanValues.get(s.charAt(i));
                i++;
            }
        }

        return sum;
    }
}