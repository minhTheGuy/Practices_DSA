public class Test {
    public static void main(String[] args) {
        // BST bst = new BST();
        // bst.insert(8);
        // bst.insert(3);
        // bst.insert(4);
        // bst.insert(7);
        // bst.insert(6);
        // bst.insert(15);
        // bst.insert(9);
        // bst.insert(16);
        // bst.insert(1);
        // bst.lnr();
        BST bst = createTree("12 35 76 1 88 21 52 90 4 17 9");
        bst.rnl();
        System.out.println("\n" + bst.contains(36));
        bst.deleteMax();
        bst.lnr();
        BST bst1 = createTree("8 3 4 7 6 15 9 16 1");
        System.out.println("\n" + bst1.sum());
        System.out.println(bst1.sumEven());
        System.out.println(bst1.countLeaves());
        System.out.println(bst1.sumEvenKeysAtLeaves());
        bst1.bfs();
    }
    //Ex2
    public static BST createTree(String strKey) {
        BST tree = new BST();
        String[] numbers = strKey.split(" ");
        for (String num : numbers)
            tree.insert(Integer.parseInt(num));
        return tree;
    }
}