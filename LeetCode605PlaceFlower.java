public class LeetCode605PlaceFlower {
    private static boolean solution(int[] arr, int n){
        int len = arr.length;
        int placed = n;
        
        if(n == 1) return true;

        for(int i = 0; i < len; i++){
            if(arr[i] == 0 && (i == 0 || arr[i - 1] == 0) && (i == arr.length-1 || arr[i + 1] == 0)){
                arr[i] = 1;
                placed--;
                i++;

                if(placed == 0){
                    return true;
                }
            } 
        }
        return placed == 0;
    }

    public static void main(String[] args) {
        int[] arr2 = {1,0,00,1,0,0,0,1};
        System.out.println(solution(arr2, 1));
        System.out.println(solution(arr2, 2));
    }
}
