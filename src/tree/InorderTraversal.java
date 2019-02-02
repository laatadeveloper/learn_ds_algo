package tree;

import tree.model.TreeNode;

public class InorderTraversal {

    public static void execute(TreeNode root){
        printInorderRec(root);
    }

    public static void printInorderRec(TreeNode root){
        if(root == null)
            return;
        printInorderRec(root.left);
        System.out.println(root.value);
        printInorderRec(root.right);
    }
}
