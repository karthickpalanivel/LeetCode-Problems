public class LeetCode2379BlackBlocks {
    public static void main(String[] args) {
        System.out.println(minimumRecolors("WBBWWBBWBW", 7));
        System.out.println(minimumRecolors("WBWBBBW", 2));
    }

    private static int minimumRecolors(String blocks, int k) {
        if(k == 0) return 0;

        int result = 0;
        
        for(int i = 0; i < blocks.length(); i++){
            String sub = blocks.substring(i, i+k);
            
        }
        return result;
    }
}
