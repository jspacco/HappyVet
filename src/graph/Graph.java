package graph;

import java.util.List;

public class Graph 
{
    // FIXME: This is pseudocode, not full code for a graph

    // Private constructor
    private Graph() {
        // create an empty graph
    }

    // Static factory for directed graph
    public static Graph directedGraph(List<Edge> edges) {
        Graph g = new Graph();
        //TODO: connect all of the edges and make them directed
        // there would probably be more methods in Graph that are not shown here to make this work
        return g;
    }

    // Static factory for undirected graph
    public static Graph undirectedGraph(int n, List<Edge> edges) {
        Graph g = new Graph();
        // TODO: connect all of the edges but make the graph undirected
        // again, there would probably be more methods in Graph that are not shown here to make this work
        return g;
    }
    
}
