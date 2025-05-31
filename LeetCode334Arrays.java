public class LeetCode334Arrays {
    private static boolean solution(int[] nums){
        int iVal = Integer.MAX_VALUE;
        int jVal = Integer.MAX_VALUE;
        
        for(int i : nums){
            if(i <= iVal) iVal = i;
            else if(i <= jVal) jVal = i;
            else return true;
        }

        return false;
    }    

    public static void main(String[] args) {
        int[] arr1 = { 20, 100, 10, 12, 5, 13};
        int[] arr2 = { 5, 4, 3, 2, 1};
        int[] arr3 = { 2, 1, 5, 0, 4, 6};

        System.out.println(solution(arr3));
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }
}
