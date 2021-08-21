// Node class for use in implementing various types of binary Trees
package BinaryTrees;

public class TreeNode {
    int value;
    TreeNode right;
    TreeNode left;

    public TreeNode(int v){
        this.value = v;
        this.right = null;
        this.left = null;
    }

    public int getValue(){
        return value;
    }

    public void printNodeValue(){
        System.out.print("[" + value + "]");
    }

    public TreeNode getRightChild() {
        return right;
    }

    public TreeNode getLeftChild() {
        return left;
    }
    
}

