public class LeetCode2843CountSymmetric {
    private static int solution(int low, int high){
        int count = 0;
        
        for(int i = low; i <= high; i++){
            String number = String.valueOf(i);
            int len = number.length();

            if(len % 2 == 1) continue;
            
            String one = number.substring(0, len / 2);
            String two = number.substring(len / 2);

            if(sumTheString(one) == sumTheString(two)) count++;
        }
        
        return count;
    }

    private static int sumTheString(String number){
        int sum = 0;
        
        for(int i = 0; i < number.length(); i++){
            char s = number.charAt(i);
            
            if(Character.isDigit(s)){
                int digit = Character.getNumericValue(number.charAt(i));
                sum += digit;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 100));
        System.out.println(solution(1000, 2000));
    }
}
