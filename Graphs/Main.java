public class Main {

    public static void main(String[] args) {

        Graph<String> graph = new Graph<>();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A", "B", 10);
        graph.addEdge("A", "C", 5);
        graph.addEdge("B", "D", 8);
        graph.addEdge("C", "D", 3);

        graph.printGraph();

        System.out.println("\nBFS:");

        graph.bfs("A");
    }
}