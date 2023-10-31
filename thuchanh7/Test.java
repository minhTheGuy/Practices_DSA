class Test {
    public static void main(String[] args) {
        AVL avl = new AVL();
        avl.insert(1);
        avl.insert(2);
        avl.insert(3);
        avl.insert(4);
        avl.insert(5);
        avl.bfs();
        avl.delete(1);
        avl.bfs();
    }
}
//     2
// 1       3
//             4
//                 5
//     2
//        4
        
//     3       5