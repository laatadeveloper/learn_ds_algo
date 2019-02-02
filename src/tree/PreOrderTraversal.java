package tree;

import tree.model.TreeNode;

public class PreOrderTraversal {
    
    public static void execute(TreeNode root){
        printPreorderRec(root);
    }

    public static void printPreorderRec(TreeNode root){
        if(root == null)
            return;
        System.out.println(root.value);
        printPreorderRec(root.left);
        printPreorderRec(root.right);
    }
}
