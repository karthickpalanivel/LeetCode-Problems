public class PigLatin {
    private static String solution(String word){
        if(word.length() == 0 || word.equals(null)){
            return "Invalid input";
        }

        int n = word.length();
        String newWord = word.toLowerCase();
        int i = 0;
        
        if(check(newWord.charAt(0))){
            return word + "-yay";
        }

        else {
            while(i < n){
                if(check(newWord.charAt(i))) break;
                else i++;
            }

            String strOne = word.substring(i);
            String strTwo = word.substring(0, i);
            
            return strOne + "-" + strTwo + "ay";
        }
    }

    private static boolean check(char c){
        return "aeiou".indexOf(c) != -1;
    }
    
    public static void main(String[] args) {
        System.out.println(solution("Crypto"));
        System.out.println(solution("Egg"));
        System.out.println(solution("under"));
        System.out.println(solution("hello"));
        System.out.println(solution(""));
        // System.out.println(solution(null));
        
    }    
}
