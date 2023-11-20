import java.util.ArrayList;
import java.util.LinkedList;

public class AdjacencyList {
    private int V;
    private ArrayList<LinkedList<Integer>> adj;

    public AdjacencyList(int v) {
        V = v;
        adj = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < v; i++)
            adj.add(new LinkedList<Integer>());
    }

    public void addEdge(int src, int dest) {
        adj.get(src).add(dest);
        adj.get(dest).add(src);
    }

    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Integer v : adj.get(i))
                System.out.print("->" + v);
            System.out.println(); 
        }
    }

    public int countVertex() {
        return V;
    }

    public int countEdge() {
        int count = 0;
        for (int i = 0; i < V; i++)
            count += adj.get(i).size();
        return count / 2;
    }

    public void printNeighbors(int v) {
        System.out.print("Neighbors of vertex " + v + ": ");
        for (Integer i : adj.get(v))
            System.out.print(i + " ");
    }

    public boolean hasEdge(int src, int dest) {
        return adj.get(src).contains(dest);
    }
}
