package BinaryTrees;

public class BinarySearchTree {

    TreeNode root;

    public BinarySearchTree(int val){
        root = new TreeNode(val);
    }

    // ADD A VALUE to BST
    public void add(int value){
        root = addRecursive(root, value);
    }

    // Recursive method to place value in its appropriate place in BST.
    private TreeNode addRecursive(TreeNode current, int value){
        if(current == null){
            return new TreeNode(value);
        }
        if(value > current.value){
            current.right = addRecursive(current.right, value);
        } else if(value < current.value){
            current.left = addRecursive(current.left, value);
        }
        // Value already in BST
        return current;
    }

    //SEARCH FOR VALUE in BST
    public boolean find(int value){
        boolean found = false;
        if(findRecursive(root, value) != null){
            found = true;
            return found;
        }
        return found;
    }

    private TreeNode findRecursive(TreeNode current, int value){
        if(current == null){
            return current;
        } 
        if(value > current.value){
            current.right = findRecursive(current.right, value);
        } else if(value < current.value){
            current.left = findRecursive(current.left, value);
        }
        return current;
    }

    public void printBST(){
        TreeNode current = root;
        if (current == null){
            System.out.print("The BST is currently empty.");
        }

    } 

    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree(7);
        boolean findTest = tree.find(7);
        System.out.println(findTest);
    }
}
