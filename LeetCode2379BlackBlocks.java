public class LeetCode2379BlackBlocks {
    public static void main(String[] args) {
        System.out.println(minimumRecolors("WBBWWBBWBW", 7));
        System.out.println(minimumRecolors("WBWBBBW", 2));
    }

    private static int minimumRecolors(String blocks, int k) {
        if(k == 0) return 0;
        int blackCount = 0;
        int result = Integer.MAX_VALUE;

        for(int i = 0; i < blocks.length(); i++){
            if((i - k >= 0) && (blocks.charAt(i - k) == 'B')) blackCount--;
            if(blocks.charAt(i)== 'B') blackCount++;
            result =  Math.min(result, k - blackCount);
        }
        return result;
    }
}
