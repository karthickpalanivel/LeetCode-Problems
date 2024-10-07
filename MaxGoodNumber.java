import java.util.*;
public class MaxGoodNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3}; 
        //arr length is fixed as 3
        solution(arr);
        sc.close();
    }

    

    private static void solution(int[] nums){
        String[] bin = new String[3];
       for(int i = 0; i<nums.length; i++){
        bin[i] = Integer.toBinaryString(nums[i]);
       }

       List<String> per = new ArrayList<>();

       per.add(bin[0] + bin[1] + bin[2]);
       per.add(bin[0] + bin[2] + bin[1]);
       per.add(bin[1] + bin[2] + bin[0]);
       per.add(bin[1] + bin[0] + bin[2]);
       per.add(bin[2] + bin[1] + bin[0]);
       per.add(bin[2] + bin[0] + bin[1]);

       int maxNum = 0; 
       for(String binString : per){
        int deci = Integer.parseInt(binString, 2);
        maxNum = Math.max(maxNum, deci);
       }
       
       System.out.println(maxNum);    
    }
}
