import java.util.*;
class AddTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of first array");
        int arr1_len = sc.nextInt();
        System.out.println("Enter the " + arr1_len + "digits for fist array");
        int[] arr1 = new int[arr1_len];
        for (int i = 0; i < arr1_len; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the length of second Array");
        int arr2_len = sc.nextInt();
        System.out.println("Enter the " + arr2_len + "digits for second array");
        int[] arr2 = new int[arr1_len];
        for (int i = 0; i < arr1_len; i++) {
            arr2[i] = sc.nextInt();
        }

        addArrays(arr1, arr2, arr1_len, arr2_len);

        sc.close();
    }
    
    public static void addArrays(int[] arr1, int[] arr2, int arr1_len, int arr2_len) {
        int num1 = 0, num2 = 0;
        for (int i = arr1_len - 1; i >= 0; i--) {
            num1 += arr1[i];
        }
        for (int i = arr2_len - 1; i >= 0; i--) {
            num2 += arr2[i];
        }

        int greatestNum = 0, leastNum = 0;
        if (arr1_len < arr2_len) {
            greatestNum = arr2_len;
            leastNum = arr1_len;
            
        }
        else {
            greatestNum = arr1_len;
            leastNum = arr2_len;
        }
        
        int resultNum = num1 + num2;
        LinkedList list = new LinkedList<Integer>();
        while (resultNum != 0) {
            int newNum = resultNum % 10;
            resultNum /= 10;
            list.add(newNum);

        }
       
        System.out.println(list);
    
    }
}