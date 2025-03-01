import java.util.*;

class PascalTriangle{
    public static void main(String[] args){
        int n = 5;
        System.out.println(solution(n));
    }

    private static List<ArrayList<Integer>> solution(int n){
        List<ArrayList<Integer>> triangle = new ArrayList<>();
        for(int i = 0; i < n; i++){
            triangle.add(generateRow(i+1));
        }
        return triangle;
    }

    private static ArrayList<Integer> generateRow(int n){
        ArrayList<Integer> row = new ArrayList<Integer>();
        int ans = 1;
        row.add(ans);
        for(int i = 1; i<n; i++){
            ans = ans * (n - i);
            ans /= i;
            row.add(ans);
        }
        return row;
    }

}