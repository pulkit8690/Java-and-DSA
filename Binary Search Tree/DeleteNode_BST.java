/*
 C-1 Node has No Child
        Delete Node and Return Null to Parent
 C-2 Node has 1 Child
        Delete Node and Replace with Child Node
 C-3 Node has 2 Child
        Replace Node with its inOrder Successor
        Delete Node for inOrder Successor
inOrder Successor-> LeftMost Node in Right Subtree
 */
public class DeleteNode_BST {
    public class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // Case 1: Leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Case 3
            Node is = InorderSuccessor(root.right);
            root.data = is.data;
            root.right = delete(root.right, is.data);
        }
        return root;
    }

    public static Node InorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        DeleteNode_BST tree = new DeleteNode_BST();
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = tree.insert(root, values[i]);
        }

        System.out.println("Inorder traversal before deletion:");
        tree.inorder(root);
        System.out.println();

        int keyToDelete = 3;
        root = delete(root, keyToDelete);

        System.out.println("Inorder traversal after deletion of " + keyToDelete + ":");
        tree.inorder(root);
        System.out.println();
    }
}

