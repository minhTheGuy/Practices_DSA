public class Ex2 {
    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.printGraph();
        System.out.println("Number of vertices: " + graph.countVertex());
        System.out.println("Number of edges: " + graph.countEdge());
        graph.printNeighbors(2);
        System.out.println("Has edge between 2 and 4: " + graph.hasEdge(2, 4));
    }
}