package permutations;
import java.util.*;
public class permutation {
    
    private static List<List<Integer>> permute(int[] arr){
        List<List<Integer>> res = new ArrayList<>();
        
        permute(res, arr, 0);
        return res;
    }
    
    private static void permute(List<List<Integer>> res, int[] arr, int idx){
        if(idx == arr.length){
            res.add(convertArrayToList(arr));
            return;
        }

        for(int i = idx; i < arr.length; i++){
            swap(arr, idx, i);
            permute(res, arr, idx + 1);
            swap(arr, idx, i);
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static List<Integer> convertArrayToList(int[] arr){
        List<Integer> list = new ArrayList<>();
        
        for(int num : arr)
            list.add(num);
        
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> res = permute(arr);

        for(List<Integer> x : res){
            System.out.println(x.toString());
        }
    }
}


/*



*/