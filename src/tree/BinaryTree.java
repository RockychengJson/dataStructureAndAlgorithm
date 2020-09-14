package tree;

public class BinaryTree {

    /**
     * 二叉树前序遍历
     *
     * @param root
     */
    public void preOrderTraverse(TreeNode root) {
        if (root == null)
            return;
        System.out.println(root.value);
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }

    /**
     * 后序遍历
     *
     * @param root
     */
    public void postOrderTraverse(TreeNode root) {
        if (root == null)
            return;
        postOrderTraverse(root.left);
        postOrderTraverse(root.right);
        System.out.println(root.value);
    }

    /**
     * 中序遍历
     *
     * @param root
     */
    public void midOrderTraverse(TreeNode root) {
        if (root == null)
            return;
        midOrderTraverse(root.left);
        System.out.println(root.value);
        midOrderTraverse(root.right);
    }
}
