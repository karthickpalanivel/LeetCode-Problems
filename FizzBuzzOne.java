public class FizzBuzzOne {
    public static void main(String[] args) {
        solution(15, 3, 5);
        solution(10, 2, 5);
        solution(20, 2, 7);    
    }

    private static void solution(int length, int one, int two){
        for(int i = 1; i <= length; i++){
            if(i % one == 0 && i % two == 0)
                System.out.println("FizzBuzz");
            else if(i % one == 0)
                System.out.println("Fizz");
            else if(i % two == 0)
                System.out.println("Buzz");
            else 
                System.out.println(i);
        }
    }
}
