import java.util.*;

public class BuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        solution(arr);
        sc.close();
    }

    private static int solution(int[] prices){
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i<prices.length; i++){
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i]-min);
        }
        return profit;
    }
}


