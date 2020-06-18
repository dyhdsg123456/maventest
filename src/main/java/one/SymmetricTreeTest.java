package one;

/**
 * @author dyh
 * @date 2020/5/22
 */
public class SymmetricTreeTest {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(3, null, null),
                new TreeNode(4, null, null)), new TreeNode(2, new TreeNode(4, null, null),
                new TreeNode(3, null, null)));
        System.out.println(isSymmetric(treeNode));
    }

    public static boolean isSymmetric(TreeNode root) {

        return isSame(root,root);
    }
    public static boolean isSame(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null){
            return true;
        }
        if(t1==null||t2==null){
            return false;
        }
        return t1.val==t2.val&&isSame(t1.left,t2.right)&&isSame(t1.right,t2.left);
    }
    public static boolean isSymmetric2(TreeNode root) {


        return false;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x,TreeNode treeNode1,TreeNode treeNode2) {
            val = x;
            left=treeNode1;
            right=treeNode2;
        }
    }
}
