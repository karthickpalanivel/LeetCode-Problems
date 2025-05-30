public class AddWithoutOperator {
    public static void main(String[] args) {
        System.out.println(solution(5, 3));
    }

    private static int solution(int a, int b){
        /*
         performing a + b or b + a without
         using '+' operator. 
         */
        while(b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }
}
