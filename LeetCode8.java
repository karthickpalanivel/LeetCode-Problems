public class LeetCode8 {
    private static int solution(String s){
        long res = 0;
        int sign = 1;   
        int i = 0; // indexing the strings

        if(s.length() == 0) return 0;
        // ' ' skip the intial spaces
        while(s.charAt(i) == ' ') i++;

        // check for the sign
        if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        } else if(s.charAt(i) == '+'){
            i++;
        }


        //iterate until we have index as numeric as sum with res variable
        for( ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch < '0' || ch > '9') break;
            res = res * 10 + (ch - '0');
            if(res * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(res * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        return (int) (sign * res);
    }

    public static void main(String[] args) {
        System.out.println(solution("42"));
        System.out.println(solution(" -042"));
        System.out.println(solution("1337c0d3"));
        System.out.println(solution("0-1"));
    }
}

