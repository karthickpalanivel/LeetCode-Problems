import java.util.*;

public class oneDTwoD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr));
        sc.close();
    }
    
    public static List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        int count = 0, max = 1;
        ans.add(new ArrayList<>());

        ans.get(0).add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
                if (count < max) {
                    ans.get(count).add(nums[i]);
                } else {
                    ans.add(new ArrayList<>());
                    max++;
                    ans.get(count).add(nums[i]);
                }
            } else {
                count = 0;
                ans.get(count).add(nums[i]);
            }
        }
        return ans;
    }
}