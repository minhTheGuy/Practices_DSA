import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class AdjacencyMatrix {
    private int[][] adj;
    private final int NUMBER_OF_VERTICES;

    public AdjacencyMatrix(int vertex) {
        NUMBER_OF_VERTICES = vertex;
        adj = new int[vertex][vertex];
    }

    public void addEdge(int src, int dest, int weight) {
        try {
            adj[src][dest] = weight;
            adj[dest][src] = weight;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void printGraph() {
        for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
            for (int j = 0; j < NUMBER_OF_VERTICES; j++)
                System.out.print(adj[i][j] + " ");
            System.out.println();
        }
    }

    public int countVertex() {
        return NUMBER_OF_VERTICES;
    }

    public int countEdge() {
        int count = 0;
        for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
            for (int j = i; j < NUMBER_OF_VERTICES; j++) {
                if (adj[i][j] != 0)
                    count++;
            }
        }
        return count;
    }

    public void printNeighbors(int vertex) {
        for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
            if (adj[vertex][i] != 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public boolean hasEdge(int src, int dest) {
        return adj[src][dest] != 0;
    }

    public void breath_First_Search(int s) {
        boolean[] visited = new boolean[NUMBER_OF_VERTICES];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(s);
        visited[s] = true; 

        while (!queue.isEmpty()) {
            int src = queue.poll();
            System.out.print(src + ": ");

            for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
                if (adj[src][i] != 0 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
            System.out.print(queue.toString());
            System.out.println();
        }
    }

    public void depth_first_search(int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + ": ");
        for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
            if (adj[s][i] != 0 && !visited[i])
                depth_first_search(i, visited);
        }
    }

    public void depth_first_search_stack(int s) {
        boolean[] visited = new boolean[NUMBER_OF_VERTICES];
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(s);
        visited[s] = true;
        while (!stack.isEmpty()) {
            int src = stack.pop();
            System.out.print(src + ": ");
            for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
                if (adj[src][i] != 0 && !visited[i]) {
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }
    }

    public AdjacencyList convertToAL() {
        AdjacencyList al = new AdjacencyList(NUMBER_OF_VERTICES);
        for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
            for (int j = i; j < NUMBER_OF_VERTICES; j++) {
                if (adj[i][j] != 0)
                    al.addEdge(i, j);
            }
        }
        return al;
    }
    public boolean isReachable(int src, int dst) {
        boolean[] visited = new boolean[NUMBER_OF_VERTICES];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(src);
        visited[src] = true;

        while (!queue.isEmpty()) {
            int s = queue.poll();
            for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
                if (adj[s][i] != 0 && !visited[i]) {
                    if (i == dst)
                        return true;
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
        return false;
    }
}