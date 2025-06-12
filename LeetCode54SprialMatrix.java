import java.util.ArrayList;
import java.util.List;

public class LeetCode54SprialMatrix {
    private static List<Integer> solution(int arr[][]){
        List<Integer> list = new ArrayList<>();
        int inLen = arr[1].length;
        int len = arr.length;
        int arrSize = len * inLen;
        int top = 0, left = 0, right = inLen - 1, bottom = len - 1;

        System.out.println(arrSize);
        int track = 0;

        while(track < arrSize){
            for(int i = left; i <= right; i++){
                list.add(arr[top][i]);
                track++;
            }

            if(track >= arrSize) break;
            top++;

            for(int i = top; i <= bottom; i++){
                list.add(arr[i][right]);
                track++;
            }
            if(track >= arrSize) break;
            right--;

            for(int i = right; i >= left; i--){
                list.add(arr[bottom][i]);
                track++;
            }
            if(track >= arrSize) break;
            bottom--;

            for(int i = bottom; i >= top; i--){
                list.add(arr[i][left]);
                track++;
            }
            if(track >= arrSize) break;            
            left++;
        }

        return list;
    }    

    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        System.out.println(solution(arr1).toString());
        System.out.println(solution(arr2).toString());
    }
}
