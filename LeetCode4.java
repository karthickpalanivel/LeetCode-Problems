public class LeetCode4 {
    private static double solution(int[] nums1, int[] nums2){
       int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1 + len2;
        int[] arr = new int[len];
        
        int i = 0, j = 0, k = 0;
        
        while (i < len1 && j < len2) {
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }
        
        while (i < len1) {
            arr[k++] = nums1[i++];
        }
        
        while (j < len2) {
            arr[k++] = nums2[j++];
        }


        if(isOdd(len)){
            return (double) arr[len / 2];
        } else {
            return (double) (arr[(len / 2) - 1] + arr[len/2]) / 2;
        }

    }

    private static boolean isOdd(int num){
        return num % 2 == 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3};
        int[] arr3 = {1,2};
        int[] arr4 = {3,4};

        System.out.println(solution(arr1, arr2));
        System.out.println(solution(arr3, arr4));
    }
}
