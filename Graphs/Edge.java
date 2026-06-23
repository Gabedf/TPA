public class Edge<T> {

    private Vertex<T> destination;
    private float weight;

    public Edge(Vertex<T> destination, float weight) {
        this.destination = destination;
        this.weight = weight;
    }

    public Vertex<T> getDestination() {
        return destination;
    }

    public float getWeight() {
        return weight;
    }
}