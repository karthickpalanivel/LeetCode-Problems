public class SubWithoutOperator {
    public static void main(String[] args) {
        System.out.println(solution(10, 7));    
    }

    private static int solution(int a, int b){
        /*
         performing a - b or b - a without
        using '-' operator. 
         */

        while(b != 0){
            int borrow = (~a) & b;
            a = a ^ b;
            b = borrow << 1;
        }

        return a;
    }
}
