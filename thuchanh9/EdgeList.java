import java.util.Vector;
import java.util.Set;
import java.util.HashSet;

public class EdgeList {
    private Vector<IntegerTriple> edges;
    
    public EdgeList() {
        edges = new Vector<IntegerTriple>();
    }

    public void addEdge(int w, int s, int d) {
        edges.add(new IntegerTriple(w, s, d));
    }

    public void printGraph() {
        for (int i = 0; i < edges.size(); i++) {
            System.out.println(edges.get(i));
        }
    }
    public int countVertex() {
        Set<Integer> vertex = new HashSet<Integer>();
        for (int i = 0; i < edges.size(); i++) {
            vertex.add(edges.get(i).getSource());
            vertex.add(edges.get(i).getDestination());
        }
        return vertex.size();
    }

    public int countEdge() {
        return edges.size();
    }

    public void printNeighbors(int u) {
        for (int i = 0; i < edges.size(); i++) {
            if (edges.get(i).getSource() == u) {
                System.out.print(edges.get(i).getDestination() + " ");
            }
            else if (edges.get(i).getDestination() == u) {
                System.out.print(edges.get(i).getSource() + " ");
            }
        }
        System.out.println();
    }

    public boolean hasEdge(int src, int dst) {
        for (int i = 0; i < edges.size(); i++) {
            if (edges.get(i).getSource() == src && edges.get(i).getDestination() == dst) {
                return true;
            }
        }
        return false;
    }
}