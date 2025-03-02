import java.util.*;

public class FindAllAnagrams {
    public static void main(String args[]){
        FindAllAnagrams sol = new FindAllAnagrams();
        String s = "cbaebabacd", p = "abc";
        System.out.println(sol.solution(s, p));
    }   
    
    public List<Integer> solution (String s, String p){
        //intialize variables
        List<Integer> result = new ArrayList<>(); //return type
        int k = p.length();
        int lenght = s.length();

        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);

        for(int i = 0; i < lenght - k + 1; i++){
            String subStr = s.substring(i, i+k);
            char[] sArr = subStr.toCharArray();
            Arrays.sort(sArr);

            if(Arrays.equals(sArr, pArr))
                result.add(i);
        }

        return result;
    }
}
