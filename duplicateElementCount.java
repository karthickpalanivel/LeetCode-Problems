import java.util.*;

class duplicateElementCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            nums.add(sc.nextInt());
        }
        int result = findDuplicate(nums, num);
        System.out.printf("The number of duplicate elements are %d", result);
        sc.close();
    }
    
    public static int findDuplicate(ArrayList<Integer> nums, int num) {
        nums.sort();
    }
}
