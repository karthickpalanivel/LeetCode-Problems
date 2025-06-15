import java.util.Arrays;

public class LeetCode322CoinChange {
    private static int solution(int[] coins, int amount){
        if(amount < 1) return 0;

        int[] minCoinsDP = new int[amount + 1];
    

        
        for(int i = 1; i <= amount; i++){
            minCoinsDP[i] = Integer.MAX_VALUE;

            for(int coin : coins){
                if(coin <= i && minCoinsDP[i - coin] != Integer.MAX_VALUE)
                    minCoinsDP[i] = Math.min(minCoinsDP[i], 1 + minCoinsDP[i - coin]);
            }
        }

        if(minCoinsDP[amount] == Integer.MAX_VALUE) return -1;
        return minCoinsDP[amount];
    }
    public static void main(String[] args) {
        int[] arrOne = {1,2,5,6,9};
        int[] arrTwo = {5,6,7,8};
        
        System.out.println(solution(arrOne, 11));
        System.out.println(solution(arrTwo, 64));
    }
}
