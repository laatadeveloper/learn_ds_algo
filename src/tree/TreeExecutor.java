package tree;

public class TreeExecutor {
    public static void execute(){
        BinaryTree binaryTree = BinaryTree.getInstance().createSampleTree();
        PreOrderTraversal.execute(binaryTree.root);
    }
}
