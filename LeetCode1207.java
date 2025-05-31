import java.util.*;

public class LeetCode1207 {
    private static boolean solution(int[] arr){
        int len = arr.length;
        if(len == 1) return true;

        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();

        for(int i : map.values()){
            if(list.contains(i))
                return false;
            else    
                list.add(i);
        }
        
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 1, 1, 3};        
        int[] arr2 = { 1, 2};
        int[] arr3 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};

        System.out.println(solution(arr3)); //true
        System.out.println(solution(arr2)); //false
        System.out.println(solution(arr1)); //true
    }
}
