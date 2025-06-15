//unfinished
public class LeetCode139 {
    private static boolean solution(String[] words, String s){

        for(String word : words){
            if(s.indexOf(word) != -1) s = s.substring(word.length());
            else return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String[] arr1 = {"leet","code"};
        String[] arr2 = {"apple","pen"};
        String[] arr3 = {"cats","dog","sand","and","cat"};

        System.out.println(solution(arr1, "leetcode"));
        System.out.println(solution(arr2, "applepenapple"));
        System.out.println(solution(arr3, "catsandog"));
    }
}
