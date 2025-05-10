public class Leetcode292NimGame {
    private boolean solution(int n){
        return n % 4 != 0;
    }
    public static void main(String[] args) {
        Leetcode292NimGame s = new Leetcode292NimGame();
        System.out.println(s.solution(4));;
    }
}
