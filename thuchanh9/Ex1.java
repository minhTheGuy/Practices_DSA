public class Ex1 {
    public static void main(String[] args) {
        AdjacencyMatrix graph = new AdjacencyMatrix(7);
        graph.addEdge(0, 1, 1);
        graph.addEdge(0, 2, 1);
        graph.addEdge(1, 3, 1);
        graph.addEdge(1, 2, 1);
        graph.addEdge(2, 4, 1);
        graph.addEdge(3, 4, 1);
        graph.addEdge(4, 5, 1);
        graph.addEdge(5, 6, 1);
        graph.printGraph();
        System.out.println("Number of vertices: " + graph.countVertex());
        System.out.println("Number of edges: " + graph.countEdge());
        System.out.print("Neighbors of vertex 2: ");
        graph.printNeighbors(2);
        System.out.println("Has edge between 2 and 4: " + graph.hasEdge(2, 4));
        //Ex 4
        AdjacencyList graph2 = graph.convertToAL();
        graph2.printGraph();
    }
}