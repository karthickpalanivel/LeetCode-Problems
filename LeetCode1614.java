import java.util.*;

/*
(1+(2*3)+((8)/4))+1
Stack = []
maxed = 2
count = 0
2,0

1. '(' -> peek == '(' || isEmpty() count ++, push stack
2. ')' && peek == '(' pop() count--;
Math.max(maxed, count);
 */

public class LeetCode1614{
    private static int maxDepth(String s){
        int max = 0;
        Stack <Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' && (stack.isEmpty() || stack.peek() == '(')){
                stack.push(ch);
            } else if(ch == ')' && stack.peek() == '(') {
                stack.pop();
            }

            max = Math.max(max, stack.size());
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(maxDepth("(1)+((2))+(((3)))"));
        System.out.println(maxDepth("()(())((()()))"));
    }
}