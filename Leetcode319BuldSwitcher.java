public class Leetcode319BuldSwitcher {
    private static int solution(int n){
        // for(int i = 0; )

        return 1;
    }

    private static boolean isPrime(int num){
        if(num <= 1){
            return true;
        } 
        
        for(int i = 2; i < Math.sqrt(i); i++){
            if(num % i == 0)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(solution(5));
        System.out.println(solution(30));
    }    
}
