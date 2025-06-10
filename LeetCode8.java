public class LeetCode8 {
    private static int solution(String s){
        int result = 0;
        s = s.trim();
        String[] nums;
        String inte = "";
        String decimal = "";
        boolean sign = s.charAt(0) == '-' ? false : true;

        if(!sign){
            s = s.substring(1);
        }


        if(s.indexOf('.') != -1){
            nums = s.split(".");
            inte = nums[0];
            decimal = nums[1];
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int num;
            if(ch >= '0' && ch <= '9'){
                num = Character.getNumericValue(ch);
            } else break;
            result *= 10;
            result += num;                        
        }

        if(!sign) result *= -1;

        // long something = Integer.parseInt(new String(result));
        // if(!is32BitSignedInteger(something)){
        //     return sign ? 2147483647 : -2147483648;
        // }
        return result;
    }

    public static boolean is32BitSignedInteger(long num) {
         return (num <= 2147483647) && (num >= -2147483648);
    }

    public static void main(String[] args) {
        System.out.println(solution("42"));
        System.out.println(solution(" -042"));
        System.out.println(solution("1337c0d3"));
        System.out.println(solution("0-1"));
    }
}
