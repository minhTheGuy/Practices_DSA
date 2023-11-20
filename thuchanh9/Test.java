public class Test {
    public static void main(String[] args) {
        AdjacencyMatrix graph = new AdjacencyMatrix(5);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 1);
        graph.addEdge(1, 4, 1);
        graph.addEdge(2, 3, 1);
        graph.addEdge(2, 4, 1);
        graph.addEdge(0, 1, 1);
        graph.addEdge(0, 2, 1);
        graph.printGraph();
        graph.breath_First_Search(0);
        AdjacencyList list_graph = new AdjacencyList(5);
        list_graph.addEdge(1, 3);
        list_graph.addEdge(2, 4);
        list_graph.addEdge(1, 2);
        list_graph.addEdge(1, 4);
        list_graph.addEdge(4, 1);
        list_graph.addEdge(4, 3);
        list_graph.addEdge(3, 0);
        list_graph.addEdge(0, 4);
        list_graph.addEdge(0, 1);
        list_graph.printGraph();
        EdgeList edge_list = new EdgeList();
        edge_list.addEdge(3, 0, 1);
        edge_list.addEdge(10, 0, 3);
        edge_list.addEdge(4, 3, 0);
        edge_list.addEdge(8, 2, 4);
        edge_list.addEdge(3, 2, 3);
        edge_list.addEdge(12, 2, 6);
        edge_list.addEdge(5, 3, 1);
        edge_list.printGraph();
    }    
}
