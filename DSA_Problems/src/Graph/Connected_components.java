package Graph;
import java.util.*;

public class Connected_components {
	
	
	// Process --> create a graph --> vertex add edge __> check visited (recursive) --> reacheable comp print
	
	int vertex;
	ArrayList<ArrayList<Integer>> adjList;
	
	Connected_components(int vertex){
		this.vertex = vertex;
		adjList = new ArrayList<>();
		
		for(int i = 0; i < vertex; i++) {
			adjList.add(new ArrayList<>());
		}
	}
	
	void addEdge(int source, int destination) {
		adjList.get(source).add(destination);
		adjList.get(destination).add(source); // Because the graph is undirected
	}
	
	void check(int vertex, boolean[] visited) {
		// Marks all the vertices in the connected component as visited
		visited[vertex] = true;
		System.out.print(vertex + " "); // Print or process the vertex as needed
		for(int i : adjList.get(vertex)) {
			if(!visited[i]) {
				check(i, visited);
			}
		}
	}
	
	void connectedcomp() {
		boolean[] visited = new boolean[vertex];
		for(int i = 0; i < vertex; i++ ) {
			if(!visited[i]) {
				check(i, visited);
				System.out.println(); // Separate connected components by new line in output
			}
		}
	}
	
	public static void main(String[] args) {
		Connected_components graph = new Connected_components(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);

        System.out.println("The Connected components are:");
        graph.connectedcomp();
	}

}
