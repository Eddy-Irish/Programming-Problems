package BinaryTrees;

public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree(){};
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

    // DELETE a node with a given value in the BST
    public void deleteValue(int value){
        root = deleteRecursive(root, value);
    }

    private TreeNode deleteRecursive(TreeNode current, int value){
        if(current == null){ return current; }
        if(value > current.value){
            current.right = deleteRecursive(current.right, value);
            return current;
        }
        if(value == current.value){
            if(current.right == null && current.left == null){
                return null;
            } else if(current.right != null && current.left != null){
                int smallestRightSubTreeValue = findSmallestValue(current.right);
                current.value = smallestRightSubTreeValue;
                current.right = deleteRecursive(current.right, smallestRightSubTreeValue);
                return current;
            } else {
                if(current.right != null){ return current.right; }
                if(current.left != null){ return current.left; }
            }
            return current;
        }
        current.left = deleteRecursive(current.left, value);
        return current;
    }
    private int findSmallestValue(TreeNode current){
        return current.left == null ? current.value : findSmallestValue(current.left);
    }

    // PRINT elements currently in BST
    public void printBST(){
        TreeNode current = root;
        if (current == null){
            System.out.print("The BST is currently empty.");
        } else {
            printRecursive(current);
        }
    } 
    private void printRecursive(TreeNode current){
        if(current != null){
            System.out.print("[" + current.value + "]");
            printRecursive(current.left);
            printRecursive(current.right);
        }
    }

    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree(7);
        tree.add(15);
        tree.add(3);
        tree.add(78);
        tree.add(111);
        tree.add(44);
        //BinarySearchTree tree2 = new BinarySearchTree();
        tree.printBST();
        System.out.println("After Deletion: ");
        tree.deleteValue(78);
        tree.printBST();
        
    }
}
