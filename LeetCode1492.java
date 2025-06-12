import java.util.LinkedList;
public class LeetCode1492 {
    private static int solution(int n, int k){
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            if(n % i == 0) list.add(i);
        }
        
        if(list.size() < k) return -1;
        else return list.get(k - 1);
    }


    public static void main(String[] args) {
        System.out.println(solution(12, 3));
        System.out.println(solution(4, 4));
        System.out.println(solution(7, 2));
    }
}
