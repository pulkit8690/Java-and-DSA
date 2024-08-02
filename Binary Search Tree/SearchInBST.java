// Time Complexity of Search in BST is O(H) where H is Height of Tree
//         In Average it is O(log n)
//         In Worst Case ie in case of Skewed Tree it is O(n)
public class SearchInBST {
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

    public boolean searchKey(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return searchKey(root.left, key);
        } else {
            return searchKey(root.right, key);
        }
    }

    public static void main(String[] args) {
        SearchInBST tree = new SearchInBST();
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = tree.insert(root, values[i]);
        }

        int keyToSearch = 4;
        if (tree.searchKey(root, keyToSearch)) {
            System.out.println("Key " + keyToSearch + " found in the BST.");
        } else {
            System.out.println("Key " + keyToSearch + " not found in the BST.");
        }
    }
}
