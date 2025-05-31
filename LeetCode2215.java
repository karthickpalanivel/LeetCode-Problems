import java.util.*;

public class LeetCode2215 {
    private static List<List<Integer>> solution(int[] nums1, int[] nums2){
        List<List<Integer>> result = new ArrayList<>();

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i : nums1)
            set1.add(i);
        
        for(int i : nums2)
            set2.add(i);
        
        for(int i : nums1){
            if(set2.contains(i) && set1.contains(i)){
                set1.remove(i);
                set2.remove(i);
            }
        }

        result.add(new ArrayList<>(set1));
        result.add(new ArrayList<>(set2));
        
        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        int[] nums3 = {1,2,3,3};
        int[] nums4 = {1,1,2,2};

        System.out.println(solution(nums1, nums2));
        System.out.println(solution(nums3, nums4));
    }
}
