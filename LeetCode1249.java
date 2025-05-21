import java.util.*;

public class LeetCode1249{
    private static String minRemoveToMakeValid(String s){
        Stack<Integer> track = new Stack<>();
        Set<Integer> index = new HashSet<>();
        int len = s.length(); 

        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);

            if(ch == '('){
                track.push(i);
            } else if(ch == ')') {
                if(!track.isEmpty())
                    track.pop();

                else
                    index.add(i);
            }
        }

        while(!track.isEmpty())
            index.add(track.pop());
        

        StringBuilder sb = new StringBuilder("");

        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);

            if(!index.contains(i))
                sb.append(ch);
        }

        return sb.toString();
    }
    
    public static void main(String args[]){
        System.out.println(minRemoveToMakeValid("lee(t(c)o)de)"));
        System.out.println(minRemoveToMakeValid("a)b(c)d"));
        System.out.println(minRemoveToMakeValid("))a(("));
    }
}