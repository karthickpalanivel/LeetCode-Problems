public class TwelveToTwentyFour {
    public static void main(String[] args) {
        String one = "12:25:00AM";
        String two = "12:25:00PM";
        String three = "1:25:00AM";
        String four = "11:25:00PM";

        System.out.println(solution(four));
        System.out.println(solution(three));
        System.out.println(solution(two));
        System.out.println(solution(one));
    }

    public static String solution(String s){
        String[] subArrays = s.split(":");
        char[] sec = subArrays[2].toCharArray();
        
        int hours = Integer.parseInt(subArrays[0]);
        String minute = subArrays[1];
        String second = Character.toString(sec[0])+Character.toString(sec[1]);
    
    
        if ((sec[2] == 'A' && hours == 12) || (sec[2] == 'a' && hours == 12)) 
            hours = 0;  
        else if ((sec[2] == 'P' && hours != 12) || (sec[2] == 'p' && hours != 12)) 
            hours += 12;  
        
        String HH = String.format("%02d", hours);
        
        String result = HH + ":" + minute + ":" + second;

        return result;  
    }
}
