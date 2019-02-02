package tree;

import tree.model.TreeNode;

import java.util.ArrayList;
import java.util.TreeMap;

public class VerticalOrderBinaryTree {

    public static void execute(TreeNode root){
        TreeMap<Integer, ArrayList<Integer>> resultMap = new TreeMap<>();
        printVerticalOrderBinaryTree(root, resultMap, 0);
        resultMap.forEach((k,v) -> System.out.println(k + " : " + v.toString()));
    }

    public static void printVerticalOrderBinaryTree(TreeNode root, TreeMap<Integer, ArrayList<Integer>> resultMap, int level){
        if(root == null)
            return;
        if(resultMap.get(level) == null){
            ArrayList<Integer> arrayList = new ArrayList<>();
            resultMap.put(level, arrayList);
        }
        resultMap.get(level).add(root.value);
        printVerticalOrderBinaryTree(root.left, resultMap, level-1);
        printVerticalOrderBinaryTree(root.right, resultMap, level+1);
    }
}
