/*
in given array sort the even number in ascending and odd numbers in descending.

eg: INPUT: [5,4,3,8,1,2,6,7,9]
OUTPUT: [9,2,7,4,5,6,3,8,1]
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Q1 {
    private static ArrayList<Integer> bitonicGenerator(int arr[]) {
        Arrays.sort(arr);
        ArrayList<Integer> indices = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 1){
                indices.add(i);
            }
        }

        int i = 0; 
        int j = indices.size() - 1;
        while(i < j){
            int left = indices.get(i);
            int right = indices.get(j);

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            i++;
            j--;
        }
        
        ArrayList<Integer> result = new ArrayList<>();

        for(int ar : arr){
            result.add(ar);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arrOne = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] arrTwo = {3, 1, 2, 4, 5, 9, 13, 14, 12};
        
        System.out.println(bitonicGenerator(arrOne));
        System.out.println(bitonicGenerator(arrTwo));

    }
}
