public class LeetCode122buyAndSell2{
    private static int solutionOne(int[] prices){
        int max = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1]){
                max += prices[i] - prices[i - 1];
            }
        }

        return max;
    }

    private static int solutionTwo(int[] prices){
        int holdPrice = -Integer.MAX_VALUE, notHold = 0;

        for(int price : prices){
            int prevHold = holdPrice, prevNotHold = notHold;

            holdPrice = Math.max(prevHold, prevNotHold - price);
            
            notHold = Math.max(prevNotHold, prevHold + price);
        }

        return notHold;
    }

    public static void main(String[] args) {
        int[] arr1 = {7,1,5,3,6,4};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {7,6,4,3,1};

        System.out.println(solutionOne(arr1)); //6
        System.out.println(solutionTwo(arr2));
    }
}