public class Ex3 {
    public static void main(String[] args) {
        EdgeList graph = new EdgeList();
        graph.addEdge(2, 1, 2);
        graph.addEdge(4, 0, 1);
        graph.addEdge(4, 0, 2);
        graph.addEdge(6, 0, 3);
        graph.addEdge(6, 0, 4);
        graph.addEdge(8, 2, 3);
        graph.addEdge(9, 3, 4);
        graph.printGraph();
        System.out.println("Number of vertices: " + graph.countVertex());
        System.out.println("Number of edges: " + graph.countEdge());
        System.out.print("Neighbors of 2: ");
        graph.printNeighbors(2);
        System.out.println("Has edge between 2 and 4: " + graph.hasEdge(2, 4));
    }
}