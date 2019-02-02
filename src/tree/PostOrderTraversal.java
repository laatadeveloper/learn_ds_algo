package tree;

import tree.model.TreeNode;

public class PostOrderTraversal {

    public static void execute(TreeNode root){
        printPostorderRec(root);
    }

    public static void printPostorderRec(TreeNode root){
        if(root == null)
            return;
        printPostorderRec(root.left);
        printPostorderRec(root.right);
        System.out.println(root.value);
    }
}
