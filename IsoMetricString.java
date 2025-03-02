import java.util.*;

public class IsoMetricString {
    public static void main(String[] args) {
        IsoMetricString sol = new IsoMetricString();
        String s = "abba";
        String t = "dog cat cat dog";
        System.out.println(sol.solution(s, t));
    }

    public boolean solution(String pattern, String t){
        String[] pArr = separateString(pattern);
        String[] subStr = t.split("\\s");

        if(pArr.length != subStr.length) return false;

        Map<String, String> pmap = new HashMap<>();
        Map<String, String> smap = new HashMap<>();

        for(int i = 0; i < pArr.length; i++){
            if(!pmap.containsKey(pArr[i]))
                pmap.put(pArr[i], subStr[i]);
            
            if(!smap.containsKey(subStr[i]))
                smap.put(subStr[i], pArr[i]);

            if(!pmap.get(pmap.containsKey(pArr[i])).equals(smap.get(smap.containsKey(subStr[i]))))
                return false;
        }

        return true;
    }

    private static String[] separateString(String pattern){
        String[] charArray = new String[pattern.length()];

        for(int i = 0; i < pattern.length(); i++){
            charArray[i] = String.valueOf(pattern.charAt(i));
        }

        return charArray;
    }


}
