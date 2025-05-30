public class FizzBuzzTwo {
    public static void main(String[] args) {
        int[] arr1 = {3, 15};
        int[] arr2 = {4, 3, 2};
        int[] arr3 = {16, 13, 8};

        solution(arr1);
        solution(arr2);
        solution(arr3);
    }

    private static void solution(int[] arr){
        int len = 0;
        int max = 0;
        for(int i : arr){
            len += i;
            max = Math.max(max, i);
        }
        
        int j = 0; 
        for(int i = 1; i <= max; i++){
            if(i % 3  == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            
            else if(i % 5 == 0) System.out.println("Buzz");
            
            else if(i % 3 == 0) System.out.println("Fizz");
            
            else System.out.println(i);


        }
    }
}
