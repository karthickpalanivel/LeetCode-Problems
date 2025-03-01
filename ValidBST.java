//not solved

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ValidBST {
    public static void main(String[] args) {
        
    }

    public boolean BstTree(TreeNode node){
        return validateBst(node, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validateBst(TreeNode node, long minValue, long maxValue) {
        if(node == null) return false;

        if(!(node.left.val > minValue && node.right.val < maxValue)) return false;

        return validateBst(node.left, minValue, node.val) && validateBst(node.right, node.val, maxValue);
    }
}
