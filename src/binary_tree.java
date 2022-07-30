class TreeNode {
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
public class binary_tree {
    public static void main(String[] args) {
        TreeNode root= new TreeNode(1);
        root.left=new TreeNode(0);
        root.right=new TreeNode(1);
        root.left.left=new TreeNode(0);
        root.left.right=new TreeNode(1);
        root.right.left= new TreeNode(1);
        root.right.right= new TreeNode(1);
        dfs(root);
    }
    public static void dfs(TreeNode root){
        if (root==null) return;
        System.out.println(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}
