import java.util.*;


public class BST {
    Node root;

    public BST() {
        this.root = null;
    }
//Ex1
    private Node insert(Node x, Integer key) {
        if (x == null)
            return new Node(key);
        int cmp = key.compareTo(x.key);
        if (cmp < 0)
            x.left = insert(x.left, key);
        else if (cmp > 0)
            x.right = insert(x.right, key);
        else
            x.key = key;
        return x;
    }

    public void insert(Integer key) {
        this.root = insert(root, key);
    }

    private void lnr(Node x) {
        if (x != null) {
            lnr(x.left);
            System.out.print(x.key + " ");
            lnr(x.right);
        }
    }

    public void lnr() {
        lnr(root);
    }

    private void rnl(Node x) {
        if (x != null) {
            rnl(x.right);
            System.out.print(x.key + " ");
            rnl(x.left);
        }
    }

    public void rnl() {
        rnl(root);
    }

    private Node search(Node x, Integer key) {
        if (x == null)
            return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0)
            return search(x.left, key);
        else if (cmp > 0)
            return search(x.right, key);
        else
            return x;
    }

    private Node findMax(Node x) {
        if (x.right == null)
            return x;
        return findMax(x.right);
    }
    
    public Node findMax() {
        return findMax(root);
    }

    private Node findMin(Node x) {
        if (x.left == null)
            return x;
        return findMin(x.left);
    }

    public Node findMin() {
        return findMin(root);
    }
    
    private Node deleteMin(Node x) {
        if (x.left == null)
            return null;
        x.left = deleteMin(x.left);
        return x;
    }

    public void deleteMin() {
        this.root = deleteMin(root);
    }

    private Node delete(Node x, Integer key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0)
            delete(x.left, key);
        else if (cmp > 0)
            delete(x.right, key);
        else {
            if (x.left == null)
                return x.right;
            if (x.right == null)
                return x.left;
            x.key = findMin(x.right).key;
            x.right = deleteMin(x.right);
        }
        return x;
    }

    public void delete(Integer key) {
        this.root = delete(root, key);
    }
//Ex 4
    public boolean contains(Integer key) {
        if (search(root, key) != null)
            return true;
        return false;
    }
//Ex 5
    private Node deleteMax(Node x) {
        if (x.right == null)
            return null;
        x.right = deleteMax(x.right);
        return x;
    }

    public void deleteMax() {
        this.root = deleteMax(root);
    }
//Ex 6
    private Node delete_pre(Node x, Integer key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0)
            delete(x.left, key);
        else if (cmp > 0)
            delete(x.right, key);
        else {
            if (x.left == null)
                return x.right;
            if (x.right == null)
                return x.left;
            x.key = findMax(x.left).key;
            x.left = deleteMax(x.left);
        }
        return x;
    }
    public void delete_pre(Integer key) {
        this.root = delete_pre(root, key);
    }
//Ex 7
    private int height(Node x) {
        if (x == null)
            return 0;
        int lheight = height(x.left) + 1;
        int rheight = height(x.right) + 1;
        return lheight < rheight ? rheight : lheight;
    }
    public int height() {
        return height(this.root);
    }
//Ex 8
    private Integer sum(Node x) {
        if (x == null)
            return 0;
        return x.key + sum(x.left) + sum(x.right);
    }
    public Integer sum() {
        return sum(this.root);
    }
//Ex 9
    private Integer sumEven(Node x) {
        if (x == null)
            return 0;
        return (x.key % 2 == 0 ? x.key : 0) + sumEven(x.left) + sumEven(x.right);
    }

    public Integer sumEven() {
        return sumEven(this.root);
    }
//Ex 10
    public int countLeaves(Node x) {
        if (x.left == null && x.right == null)
            return 1;
        return (x.left != null ? countLeaves(x.left) : 0) + (x.right != null ? countLeaves(x.right) : 0);
    }

    public int countLeaves() {
        return countLeaves(this.root);
    }
//Ex 11
    private int sumEvenKeysAtLeaves(Node x) {
        if (x.left == null && x.right == null)
            return x.key % 2 == 0 ? x.key : 0;
        return (x.left != null ? sumEvenKeysAtLeaves(x.left) : 0) + (x.right != null ? sumEvenKeysAtLeaves(x.right) : 0);
    }

    public int sumEvenKeysAtLeaves() {
        return sumEvenKeysAtLeaves(this.root);
    }
//Ex 12
    public void bfs() {
        Node tmp = root;
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(tmp);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print(curr.key + " ");
            if (curr.left != null)
                queue.offer(curr.left);
            if (curr.right != null)
                queue.offer(curr.right);
        }
    }

    public void bfs(Node root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.key + " ");
        else if (level > 1) {
            bfs(root.left, level - 1);
            bfs(root.right, level - 1);
        }
    }
}