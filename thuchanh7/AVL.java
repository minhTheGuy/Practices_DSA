public class AVL {
    private Node root;
    public AVL() {
        root = null;
    }

    public int height(Node node) {
        if (node == null)
            return -1;
        return node.height;
    }

    public int bf(Node node) {
        if (node == null)
            return -1;
        return height(node.left) - height(node.right);
    }

    public Node leftRotate(Node x) {
        Node y = x.right;
        y.right = y.left;
        y.left = x;
        x.height = Math.max(height(x.left), height(x.right)) + 1; 
        y.height = Math.max(height(y.left), height(y.right)) + 1; 
        return y;
    }

    public Node rightRotate(Node x) {
        Node y = x.left;
        y.left = y.right;
        y.right = x;
        x.height = Math.max(height(x.left), height(x.right)) + 1; 
        y.height = Math.max(height(y.left), height(y.right)) + 1; 
        return y;
    }

    public Node balance(Node x) {
        if (bf(x) == 2) {
            if (bf(x.left) == -1) //left right case 
                x.left = leftRotate(x.left);
            x = rightRotate(x);
        }
        else if (bf(x) == -2) {
            if (bf(x.right) == -1) //right left case 
                x.right = rightRotate(x.right);
            x = leftRotate(x);
        }
        return x;
    }

    public Node insert(Node node, Integer key) {
        if (node == null)
            return new Node(key);
        int cmp = key.compareTo(node.key);
        if (cmp < 0)
            node.left = insert(node.left, key);
        else if (cmp > 0)
            node.right = insert(node.right, key);
        else 
            return node;
        
        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = bf(node);

        return balance(node);
    }
    
    private Node min(Node x) {
        if (x.left == null)
            return x;
        return min(x.left);
    }

    private Node deleteMin(Node x) {
        if (x.left == null)
            return x.right;
        x.left = deleteMin(x.left);
        return x;
    }

    public Node delete(Node node, Integer key) {
        if (node == null)
            return null;
        int cmp = key.compareTo(key);
        if (cmp < 0)
            node.left = delete(node.left, key);
        else if (cmp > 0)
            node.right = delete(node.right, key);
        else
            {
                if (node.left == null)
                    return node.right;
                if (node.right == null)
                    return node.left;
                node.key = min(node.right).key;
                node.right = deleteMin(node.right);
            }
        return balance(node);
    }
}