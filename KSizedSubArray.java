import java.io.*;
import java.util.*;

class KSizedSubArray{
    public ArrayList<Integer> solution(int[] arr, int k){
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int length = sc.nextInt();
        int[] arr = new int[length];

        System.out.println("Enter the Elements of the Array");
        for(int i = 0; i < length; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the Fixex SubArray size");
        int k = sc.nextInt();

        KSizedSubArray sol = new KSizedSubArray();
        System.out.println(sol.solution(arr, k));

        sc.close();
    }
}

